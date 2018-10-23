package core.generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

/**
 * @ScriptName    : StepBase
 * @Description   : This class contains generic functionalities like setup/tear down test environment  
 * @Author        : Digvijay Dusane(Aress)
 * @Creation Date : 07 Dec 2017   @Modified Date:                       
 */
public class StepBase2 
{
	// Local Variables
	protected static AppiumDriver driver = null;
	protected static WebDriverWait webDriverWait;
	protected static Scenario crScenario;

	/**
	 * @Method: setUp
	 * @Description:  
	 * @Author        : Digvijay Dusane(Aress)
	 * @Creation Date : 05 Dec 2017   @Modified Date: 
	 */
	public void setUp(Scenario cScenario)
	{
		crScenario = cScenario;
		try
		{
			// Load configuration file
			Properties objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/core/config.properties"));
		 	
			// Load specified mobile properties file
			Properties objMobileConfig = new Properties();
			objMobileConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/core/mobileConfig/" + objConfig.getProperty("test.device") + ".properties"));

			if(objConfig.getProperty("test.platform").equalsIgnoreCase("android"))
			{
				// Set the capabilities for AndroidDriver
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, objConfig.getProperty("test.browser"));
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, objMobileConfig.getProperty("device.platformName"));
				capabilities.setCapability(MobileCapabilityType.VERSION, objMobileConfig.getProperty("device.platformVersion"));
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, objMobileConfig.getProperty("device.name"));
				//capabilities.setCapability("autoAcceptAlerts", false);
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				webDriverWait = new WebDriverWait(driver, 90);
				driver.get(objConfig.getProperty("test.browser.url"));
				
				Set<String> contextNames = driver.getContextHandles();
				for (String contextName : contextNames) 
				{
					if(contextName.contains("WEBVIEW_"))
					{
						driver.context(contextName);
					}
				}
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			}

			else if(objConfig.getProperty("platform").equalsIgnoreCase("ios"))
			{
				// Set the capabilities for IOSDriver
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("deviceName", objMobileConfig.getProperty("device.name")); 
				capabilities.setCapability("platformName", objMobileConfig.getProperty("device.platformName"));
				capabilities.setCapability("platformVersion", objMobileConfig.getProperty("device.platformVersion"));
				capabilities.setCapability("udid", objMobileConfig.getProperty("device.udid"));
				capabilities.setCapability("autoAcceptAlerts",true);
				File appdir = new File(System.getProperty("user.dir") + "/src/test/java/com/mobileApps");
				File app = new File(appdir, objConfig.getProperty("test.app.name") + ".ipa");
				capabilities.setCapability("app", app.getAbsolutePath());
				driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				webDriverWait = new WebDriverWait(driver, 90);
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	/**
	 * @Method: tearDown
	 * @Description:  
	 * @Author: Digvijay Dusane(Aress)
	 * @throws IOException 
	 * @Creation Date : 05 Dec 2017   @Modified Date:
	 */
	public void tearDown(Scenario scenario) 
	{
		try 
		{
			if (scenario.isFailed()) 
			{
				embedScreenshot();
			}
			driver.manage().deleteAllCookies();
			driver.quit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	/**
	 * @Method: getDriver
	 * @Description:  
	 * @return :Appium Driver instance
	 * @Author: Digvijay Dusane(Aress)
	 * @Creation Date : 05 Dec 2017   @Modified Date:
	 */
	public AppiumDriver getDriver()
	{
		return driver;
	}

	/**
	 * Method: embedScreenshot
	 * Description: 
	 * @param 
	 * @author Digvijay Dusane(Aress)
	 * @Creation Date : 05 Dec 2017   @Modified Date:
	 */
	public static void embedScreenshot()
	{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		crScenario.embed(screenshot, "image/png"); //stick it in the report
	}
}

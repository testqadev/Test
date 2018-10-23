package com.face.pageFactory;

import java.awt.AWTException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;



public class HMAPage {
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	By registerButton = By.xpath("(//a[@id = 'signup_btn'])[1]");
	By firstNametext = By.xpath("//input[@name = 'first_name']");
	By lastNametext = By.xpath("//input[@name = 'last_name']");
	By emailIDtext = By.xpath("//input[@name = 'email']");
	By countryNametext = By.xpath("//select[@name = 'country']");
	//By countryNametext = By.xpath("//option[text()='Select Country']");
	By Password = By.xpath("//input[@name = 'password']");
	By ConfirmPassword = By.xpath("//input[@name = 'password_confirmation']");
	By checkBox = By.xpath("//input[@id='terms_and_conditions']");
	By registerButton1 = By.xpath("//button[@id= 'sign_up_btn']");
	By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	By BPMonthlyService = By.xpath("(//div[@class='insite '])[1]");
	By BPQuarterlyService = By.xpath("(//div[@class='insite '])[2]");
	By BPYearlyService = By.xpath("(//div[@class='insite '])[3]");
	By BPHalfYearlyService = By.xpath("(//div[@class='insite '])[4]");
	
	By WRMonthlyService = By.xpath("(//div[@class='insite '])[5]");
	By WRQuarterlyService = By.xpath("(//div[@class='insite '])[6]");
	By WRYearlyService = By.xpath("(//div[@class='insite '])[7]");
	
	By BPWeeklyMonthlyService = By.xpath("(//div[@class='insite '])[8]");
	By BPWeeklyQuarterlyService = By.xpath("(//div[@class='insite '])[9]");
	By BPWeeklyYearlyService = By.xpath("(//div[@class='insite '])[10]");
	By BPWeeklyHalfYearlyService = By.xpath("(//div[@class='insite '])[11]");
	
	By NextButton = By.xpath("//div[@class='proceed-btn next-to-pay']");
	
	By emailLogin = By.xpath("//input[@type='text']");
	By passwordLogin1 = By.xpath("//input[@name = 'password']");
	By loginButton = By.xpath("//button[text()='Login']");
	By checkboxTermsCondition = By.xpath("//input[@id='agreeterms']");
	By agreeButton = By.xpath("//a[@id='login-terms-condition-agree']");
	
	By editProfile = By.xpath("//span[text()='Edit Profile']");
	By completeProfile = By.xpath("//a[text()='Complete your profile']");
	
	By profileImage = By.xpath("//input[@id='profile_image']");
	By firstNameInfo = By.xpath("//input[@id='first_name']");
	By lastNameInfo = By.xpath("//input[@id='first_name']");
	By birthDate = By.xpath("//input[@id='date_birth']");
	By gender = By.xpath("//select[@id='gender']");
	By address = By.xpath("//input[@id='address']");
	By countryInfo = By.xpath("//select[@id='country']");
	By state = By.xpath("//select[@id='state']");	
	By zipcode = By.xpath("//input[@id='zipcode']");
	By city = By.xpath("//input[@id='city']");
	By contactNumber = By.xpath("//input[@id='contact_no']");
	By emailInfo = By.xpath("//input[@id='email']");
	By saveInfo = By.xpath("(//input[@value='SAVE'])[1]");
	

	public boolean clickRegister() throws AWTException {
		objWrapperFunctions.click(registerButton);
		return true;
	}

	public boolean enterfirstName(String firstName) throws AWTException {
		objWrapperFunctions.setText(firstNametext, firstName);
		return true;
	}
	
	public boolean enterlastName(String lastName) throws AWTException {
		objWrapperFunctions.setText(lastNametext, lastName);
		return true;
	}
	
	public boolean enterEmail(String email) throws AWTException {
		objWrapperFunctions.setText(emailIDtext, email);
		return true;
	}
	
	public boolean selectCountry(String countryName) throws AWTException, InterruptedException {
		//objWrapperFunctions.wait(2000);
		objWrapperFunctions.selectEsctDrpdown(countryNametext, 2);
		return true;
	}
	
	public boolean selectUKCountry(String countryName1) throws AWTException, InterruptedException {
		//objWrapperFunctions.wait(2000);
		objWrapperFunctions.selectEsctDrpdown(countryNametext, 1);
		return true;
	}
	
	public boolean enterPasswordtext(String password) throws AWTException {
		objWrapperFunctions.setText(Password, password);
		return true;
	}
	
	public boolean enterConfirmPasswordtext(String confirmPassword) throws AWTException {
		objWrapperFunctions.setText(ConfirmPassword, confirmPassword);
		return true;
	}
	
	public boolean clickCheckbox() throws AWTException {
		objWrapperFunctions.click(checkBox);
		return true;
	}
	
	public boolean clickRegister1() throws AWTException {
		objWrapperFunctions.click(registerButton1);
		return true;
	}
	
	public boolean verifySuccessMessage() throws AWTException {
		objWrapperFunctions.click(successMessage);
		System.out.println("Verfied the Success Message");
		return true;
	}
	//--------------------------------------------Activation-------------------------------------------------//
	
	public boolean monthlyPackageBP() throws AWTException {
		objWrapperFunctions.click(BPMonthlyService);
		return true;
	}
	
	public boolean quaterlyPackageBP() throws AWTException {
		objWrapperFunctions.click(BPQuarterlyService);
		return true;
	}
	
	public boolean yearlyPackageBP() throws AWTException {
		objWrapperFunctions.click(BPYearlyService);
		return true;
	}
	//----------------------------------------Login----------------------------------------------------------//
	
	public boolean enteremailLogin(String registerEmail) throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		objWrapperFunctions.setText(emailLogin, registerEmail);
		return true;
	}
	
	public boolean enterpasswordLogin(String passwordLogin) throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		StepBase.driver.findElement(By.xpath("//input[@name = 'password']")).clear();
			objWrapperFunctions.setText(passwordLogin1, passwordLogin);
		return true;
	}
	
	public boolean clickLoginButton() throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		objWrapperFunctions.click(loginButton);
		return true;
	}
	
	public boolean clickTermsConditionPopUp() throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		objWrapperFunctions.click(checkboxTermsCondition);
		return true;
	}
	
	public boolean clickAgreeButton() throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		objWrapperFunctions.click(agreeButton);
		return true;
	}
	//---------------------------------------Personal Info-----------------------------------------------------//
	
	public boolean editProfileInfo() {
	     objWrapperFunctions.click(editProfile);
		 return true;
	}
	
	public boolean uploadPhotoTo() {
		 String	filePath=null;
	     objWrapperFunctions.click(profileImage);
		 objWrapperFunctions.uploadPhoto(profileImage, filePath);
		 return true;
	}
	
	public boolean firstNameBasicInfo(String firstName) throws AWTException, InterruptedException {
		objUtilities.waitForPageLoad();
		objWrapperFunctions.setText(firstNameInfo, firstName);
		return true;
	}

}

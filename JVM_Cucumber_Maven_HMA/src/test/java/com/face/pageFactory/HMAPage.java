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
	
	By emailLogin = By.xpath("//input[@type='text']");
	By passwordLogin1 = By.xpath("//input[@name = 'password']");
	By loginButton = By.xpath("//button[text()='Login']");
	
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
	
	//----------------------------------------Login----------------------------------------------------------//
	
	public boolean enteremailLogin(String registerEmail) throws AWTException, InterruptedException {
		//StepBase.driver.findElement(emailLogin).sendKeys("niki@yopmail.com");
		objWrapperFunctions.setText(emailLogin, registerEmail);
		return true;
	}
	
	public boolean enterpasswordLogin(String passwordLogin) throws AWTException {
		//StepBase.driver.findElement(emailLogin).sendKeys("Aress123$");
			objWrapperFunctions.setText(passwordLogin1, passwordLogin);
		return true;
	}
	
	public boolean clickLoginButton() throws AWTException, InterruptedException {
		//objWrapperFunctions.wait(3000);
		objWrapperFunctions.click(loginButton);
		return true;
	}
	
	//---------------------------------------Personal Info-----------------------------------------------------//
	
	public boolean uploadPhotoTo() {
		 String	filePath=null;
	     objWrapperFunctions.click(profileImage);
		 objWrapperFunctions.uploadPhoto(profileImage, filePath);
		 return true;
	}

}

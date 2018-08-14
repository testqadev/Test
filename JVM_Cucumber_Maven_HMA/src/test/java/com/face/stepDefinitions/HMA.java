package com.face.stepDefinitions;

import java.awt.AWTException;
import org.junit.Assert;

import com.face.pageFactory.HMAPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 08 Jan 2018   @Modified Date:                    
 */
public class HMA {
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private HMAPage objHMAPage = new HMAPage();
	
	@Given("^Click on Register Button$")
	public void clickRegisterButton() throws AWTException
	{
		Assert.assertTrue(objHMAPage.clickRegister());
	}
	
	@Then("^Enter first name(.*)$")
	public void enterFirstName(String firstName) throws AWTException
	{
		Assert.assertTrue(objHMAPage.enterfirstName(firstName));
	}
	
	@Then("^Enter last name(.*)$")
	public void enterLastName(String lastName) throws AWTException
	{
		Assert.assertTrue(objHMAPage.enterlastName(lastName));
	}
	
	@Then("^Enter the email(.*)$")
	public void enterEmailId(String email) throws AWTException
	{
		Assert.assertTrue(objHMAPage.enterEmail(email));
	}

	@Then("^Select the USA Country(.*)$")
	public void selectUSAcountry(String countryName) throws AWTException, InterruptedException  
	{
		Assert.assertTrue(objHMAPage.selectCountry(countryName));	
	}
	
	@Then("^Select the UK Country(.*)$")
	public void selectUKcountry(String countryName1) throws AWTException, InterruptedException  
	{
		Assert.assertTrue(objHMAPage.selectUKCountry(countryName1));	
	}
	
	@Then("^Enter the Password(.*)$")
	public void enterPassword(String password) throws AWTException  
	{
		Assert.assertTrue(objHMAPage.enterPasswordtext(password));	
	}
	
	@Then("^Enter the Confirm Password(.*)$")
	public void enterConfirmPassword(String confirmPassword) throws AWTException  
	{
		Assert.assertTrue(objHMAPage.enterConfirmPasswordtext(confirmPassword));	
	}
	
	@Then("^Click on Checkbox$")
	public void clickCheckBox() throws AWTException  
	{
		Assert.assertTrue(objHMAPage.clickCheckbox());	
	}
	
	@Then("^Click on Register Button1$")
	public void clickRegisterButton1() throws AWTException  
	{
		Assert.assertTrue(objHMAPage.clickRegister1());	
	}
	
	//--------------------------------------------Login------------------------------------------------------//

	@Given("^Enter Registered Email on Login form(.*)$")
	public void enterEmailLogin(String registerEmail) throws AWTException, InterruptedException  
	{
		Assert.assertTrue(objHMAPage.enteremailLogin(registerEmail));	
	}
	
	@Then("^Enter Password on Login form(.*)$")
	public void enterPasswordLogin(String passwordLogin) throws AWTException  
	{
		Assert.assertTrue(objHMAPage.enterpasswordLogin(passwordLogin));	
	}
	
	@Then("^Click on Login Button$")
	public void clickLogin() throws AWTException, InterruptedException  
	{
		Assert.assertTrue(objHMAPage.clickLoginButton());	
	}
	
	//---------------------------------------Personal Info-----------------------------------------------------//
	
	@Then("^Upload the Profile Image$")
	public void uploadPhoto()
	{
		Assert.assertTrue(objHMAPage.uploadPhotoTo());	
	}
	
}

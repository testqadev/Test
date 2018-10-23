Feature: HMA
@Test1
Scenario Outline: Verify the Registration process of USA
	
	Given Click on Register Button 
	Then Enter first name<firstName>
	Then Enter last name<lastName>
	Then Enter the email<email>
	Then Select the USA Country<countryName>
	Then Enter the Password<password>
	Then Enter the Confirm Password<confirmPassword>
	Then Click on Checkbox
	Then Click on Register Button1
	Then Verify the success message
	
Examples:
	| firstName | lastName | email                        | countryName | password  | confirmPassword |                      
	| Meera     | Pingle   | testUSA2userUSA2@yopmail.com | 1           | Aress123$ | Aress123$       |
	

@Test2
Scenario Outline: Verify the Service process of USA
	
	Given Select the Monthly package for BLOOD PRESSURE MONITORING SERVICE
	Then Select the Quaterly package for BLOOD PRESSURE MONITORING SERVICE
	Then Select the Yearly package for BLOOD PRESSURE MONITORING SERVICE
	#Then Select the Half Yearly package for BLOOD PRESSURE MONITORING SERVICE
	#Then Select the Monthly package for WEIGHT REDUCTION PROGRAM
	#Then Select the Quaterly package for WEIGHT REDUCTION PROGRAM
	#Then Select the Yearly package for WEIGHT REDUCTION PROGRAM
	#Then Select the Monthly package for BLOOD PRESSURE MONITORING SERVICE WEEKLY REVIEW
	#Then Select the Quaterly package for BLOOD PRESSURE MONITORING SERVICE WEEKLY REVIEW
	#Then Select the Yearly package for BLOOD PRESSURE MONITORING SERVICE WEEKLY REVIEW
	#Then Select the Half Yearly package for BLOOD PRESSURE MONITORING SERVICE WEEKLY REVIEW
	#Then Click on Next Button
	#Then Click on Back Button
	#Then Again Click on Next Button	
	#Then Click on Next Button for Shipping Address
	#Then Enter First Name for Shipping Address<firstNameShip>
	#Then Enter Last Name for Shipping Address<lastNameShip>
	#Then Enter Address Line for Shipping Address<addressShip>
	#Then Select Country for Shipping Address
	#Then Select State for Shipping Address
	#Then Enter the City for Shipping Address<cityShip>
	#Then Enter the Zip Code for Shipping Address<zipShip>
	#Then Enter the email for Shipping Address<emailShip>
	#Then Enter the Contact Number for Shipping Address<contactShip>
	#Then Again Click on Next Button for Shipping Address
	#Then Click on Next Button for Shipping Address
	#Then Click on Back Button for Billing Address
	#Then Again Click on Next Button for Billing Address
	#Then Select the Checkbox for Billing Address
	#Then Unselect the Checkbox for Billing Address
	#Then Enter First Name for Shipping Address<>
	#Then Enter Last Name for Shipping Address<>
	#Then Enter Address Line for Shipping Address<>
	#Then Select Country for Shipping Address
	#Then Select State for Shipping Address
	#Then Enter the City for Shipping Address<>
	#Then Enter the Zip Code for Shipping Address<>
	#Then Enter the email for Shipping Address<>
	#Then Enter the Contact Number for Shipping Address<>
	#Then Again Click on Next Button for Billing Address1
	#Then Click on Back Button of Payment
	#Then Click on Pay Now Button
	#Then Enter the Email for Payment<>
	#Then Enter the Card Number<>
	#Then Enter Validity Month and Year<>
	#Then Enter CVC<>
	#Then Click on Pay Button
	#Then Verify the Payment Success Message
	#Then It should navigate to the Dashboard	
		
Examples:
	| firstNameShip | lastNameShip | addressShip              | cityShip | zipShip  | emailShip | contactShip | firstNameBil | lastNameBil | addressBil | cityBil | zipBil | emailBil | contactBil |           
	| Harsh         | Pingle       | testUKuserUK@yopmail.com | 2        | Aress123$| Aress123$ | 8448844884  |              |             |            |         |        |          |            |
		
	
@Test3
Scenario Outline: Verify the Registration process of UK
	
	Given Click on Register Button 
	Then Enter first name<firstName>
	Then Enter last name<lastName>
	Then Enter the email<email>
	Then Select the UK Country<countryName1>
	Then Enter the Password<password>
	Then Enter the Confirm Password<confirmPassword>
	Then Click on Checkbox
	Then Click on Register Button1	
		
Examples:
	| firstName | lastName | email                    | countryName1 | password  | confirmPassword |                      
	| Harsh     | Pingle   | testUK1userUK1@yopmail.com | 2            | Aress123$ | Aress123$       |
	
	
@Test4
Scenario Outline: Verify the Login
	
	Given Enter Registered Email on Login form<registerEmail>
	Then Enter Password on Login form<passwordLogin>
	Then Click on Login Button
		
Examples:
	| registerEmail      | passwordLogin |                  
	| ankita@yopmail.com | aress123$     |
	
	
@Test5
Scenario Outline: Verify the Login

	Given Enter Registered Email on Login form<registerEmail>
	Then Enter Password on Login form<passwordLogin1>
	Then Click on Login Button
	Then Terms and Conditions Pop-up
	Then Click on Agree Button
	Then Click on Edit profile
	Then Upload the Profile Image
	Then Enter the first name in Basic Info section<firstName>
	#Then Enter the last name in Basic Info section<lastName>
	#Then Enter the Date of Birth in Basiv Info section<birthDate>
	#Then Select the Gender<gender>
	
		
Examples:
	|registerEmail               |passwordLogin1| firstName | lastName | birthDate  | gender |               
	|test121.user121@yopmail.com |12345678		| Pooja     | Kale     | 03/10/1995 | Female |
	
	
	
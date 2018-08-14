Feature: HMA
@Test1
Scenario Outline: Verify the Registration process of USA
	
	Given Click on Register Button 
	Then Enter first name <firstName>
	Then Enter last name <lastName>
	Then Enter the email <email>
	Then Select the USA Country <countryName>
	Then Enter the Password <password>
	Then Enter the Confirm Password <confirmPassword>
	Then Click on Checkbox
	#Then Click on Register Button1
	
	
Examples:
	| firstName | lastName | email             | countryName | password  | confirmPassword |                      
	| Meera     | Pingle   | meera1@yopmail.com | 1           | Aress123$ | Aress123$       |
	
	
@Test2
Scenario Outline: Verify the Registration process of UK
	
	Given Click on Register Button 
	Then Enter first name <firstName>
	Then Enter last name <lastName>
	Then Enter the email <email>
	Then Select the UK Country <countryName1>
	Then Enter the Password <password>
	Then Enter the Confirm Password <confirmPassword>
	Then Click on Checkbox
	#Then Click on Register Button1	
		
Examples:
	| firstName | lastName | email             | countryName1 | password  | confirmPassword |                      
	| Harsh     | Pingle   | harsh@yopmail.com | 2            | Aress123$ | Aress123$       |
	
	
@Test3
Scenario Outline: Verify the Login
	
	Given Enter Registered Email on Login form <registerEmail>
	Then Enter Password on Login form <passwordLogin>
	Then Click on Login Button
		
Examples:
	| registerEmail      | passwordLogin |                  
	| ankita@yopmail.com | aress123$     |
	
	
@Test4
Scenario Outline: Verify the Login

	Given Enter Registered Email on Login form <registerEmail>
	Then Enter Password on Login form <passwordLogin>
	Then Click on Login Button
	Then Upload the Profile Image
	#Then Enter the first name in Basic Info section <firstName>
	#Then Enter the last name in Basic Info section <lastName>
	#Then Enter the Date of Birth in Basiv Info section <birthDate>
	#Then Select the Gender <gender>
	
		
Examples:
	| registerEmail      | passwordLogin | firstName | lastName | birthDate  | gender |               
	| ankita@yopmail.com | aress123$     | Pooja     | Kale     | 03/10/1995 | Female |
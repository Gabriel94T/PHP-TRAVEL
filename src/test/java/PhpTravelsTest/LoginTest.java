package PhpTravelsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManagement.TestBase;
import PageObjects.HomePage;
import PageObjects.LoginPage;

import PageObjects.RegistrationPage;

public class LoginTest extends TestBase
{
	
@Test
	public void SuccessfulLogin() throws InterruptedException
	{
	// Create a new object of Login scenario
			HomePage hp = new HomePage();
			// Click on Account
			hp.Account().click();
			// Click on login
			hp.LogIn().click();
			// Create a object of login page
			LoginPage lp = new LoginPage();
			// Enter email
			lp.enterEmail("test@test.test");//??
			// Enter password
			lp.enterPassword("test123");//??
			// Click on Login
			lp.Login().click();
			// Sleep for 2 seconds
			Thread.sleep(2000);
			// Expected string
			String Loginexpected = "Hi, test test";
			// Actual string
			String Loginactual = lp.Verify().getText();
			// Comparing expected and actual values using assertion
			Assert.assertEquals(Loginactual, Loginexpected);

}

/*
 * Cretate a test for invalid scenarios 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

}

package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.LoginPage;

public class LoginTest extends ProjectSpecification {

	@Test
	public void loginTest() {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickLogin();
		lp.enterPhoneno();
		lp.enterPassword();
		lp.clickOnLogin();
	}

}

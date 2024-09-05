package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.SignupPage;

public class SignupTest extends ProjectSpecification{
	
	@Test
	public void signupTest()throws InterruptedException {
		
		SignupPage sp=new SignupPage(driver);
		
		sp.clickSignup();
		sp.switchWindow();
		sp.selectTitle();
		sp.enterFirstName();
		sp.enterLastName();
		sp.selectCountry();
		sp.clickOnCalender();
		sp.selectYear();
		sp.selectMonth();
		sp.selectDate();
		sp.enterMobileNo();
		sp.enterEmail();
		sp.enterPassword();
		sp.confirmPassword();
		sp.clickOnSubmit();
			}

}

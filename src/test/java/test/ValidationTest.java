package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.ValidationPage;

public class ValidationTest  extends ProjectSpecification{
	@Test
	public void validation() {
		
		ValidationPage vp=new ValidationPage(driver);
		vp.clickCheckin();
		vp.clickFlightStatus1();
		vp.clickManageBooking();
		
	}

}

package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.OneWayTripPage;

public class OnewaytripTest extends ProjectSpecification{
	
	@Test
	   public void onewayTest ()throws InterruptedException  {
		
	    OneWayTripPage op=new OneWayTripPage(driver);
	 
	    op.clickDestination();
	    op.enterDestination();
	    op.clickDeparturedate();
	    op.selectTravelDate();
	    op.clickSearchFlight();
	    op.selectFlightPrice();
	    op.clickContinue();
	    op.selectPassangerCheckbox();
	    op.clickContinueBtn2();
	    op.clickPopupClose();
	    op.clickPopupClose2();
	    op.SkipPopup();
	    op.clickContinueBtn3();
	    op.PaymentPopup();
	    op.enterCardNumber();
	    op.enterCname();
	    op.enterCMonth();
	    op.enterCYear();
	    op.enterCvv();
	    op.clickProceedToPay();
	   
	}
		

}

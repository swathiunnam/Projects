package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.RoundTripPage;

public class RoundTripTest extends ProjectSpecification {
	
	@Test
	  public void roundWayTest() throws InterruptedException{
		   
		    RoundTripPage obj=new RoundTripPage(driver);
		    obj.clickRoundTrip();
		    obj.clickDestination();
		    obj.enterDestination();
		    obj.clickDeparturedate();
		    obj.selectTravelDate();
		    obj.clickReturnDate();
		    obj.selectTravelDate2();
		    obj.clickSearchFlight();
		    obj.selectFlightPrice();
		    obj.clickContinue();
		    obj.selectPassangerCheckbox();
		    obj.clickContinueBtn2();
		    obj.clickPopupClose();
		    obj.clickPopupClose2();
		    obj.SkipPopup();
		    obj.clickContinueBtn3();
		    obj.PaymentPopup();
		    obj.enterCardNumber();
		    obj.enterCname();
		    obj.enterCMonth();
		    obj.enterCYear();
		    obj.enterCvv();
		    obj.clickProceedToPay();
		   
		   }

}

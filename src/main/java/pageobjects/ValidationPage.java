package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class ValidationPage  extends ProjectSpecification{
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightstatus;
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement managebooking;
	

	public ValidationPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	 public void clickCheckin() {


			checkin.click();
			Assert.assertEquals(driver.getTitle(),"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			
		}
	
	public void clickFlightStatus1() {


		flightstatus.click();
		Assert.assertEquals(driver.getTitle(),"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		
	}
	
	public void clickManageBooking() {


		managebooking.click();
		Assert.assertEquals(driver.getTitle(),"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
	}
}

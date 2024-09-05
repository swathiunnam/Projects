package pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class RoundTripPage extends ProjectSpecification {
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundtrip;
	
	@FindBy(xpath="(//input[contains(@class,'css-1cwyjr8 r-homxoj')])[2]")
	WebElement to;
	
	@FindBy(xpath="//div[text()='Goa']")
	WebElement destination;
	
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement departuredate;
	
	
	@FindBy(xpath="(//div[text()='29'])[1]")
	WebElement traveldate;
	
	@FindBy(xpath = "//div[text()='Return Date']")
	WebElement returndate;
	
	@FindBy(xpath="(//div[text()='2'])[2]")
	WebElement traveldate2;
	
	@FindBy(xpath = "//div[text()='Search Flight']")
	WebElement searchflight;
	
	@FindBy(xpath = "(//div[contains(@class,'r-15d164r')])[2]")
	WebElement flightprice;
	
	@FindBy(xpath = "(//div[text()='Continue'])[1]")
	WebElement continue_btn;
	
	@FindBy(xpath = "//div[text()='I am flying as the primary passenger']")
	WebElement passanger_checkbox; 
	
	@FindBy(xpath = "//div[text()='Continue']")
	WebElement continue_btn2;
	
	@FindBy(xpath = "(//div[contains(@class,'r-eafdt9 r-1i6wzkk r-lrvibr')])[26]")
	WebElement popupclose;
	
	@FindBy(xpath="//div[@id='at_addon_close_icon']")
	WebElement popupclose2;
	
	@FindBy(xpath="(//span[@id='skipfrompopup'])[2]")
	WebElement skippopup;

	@FindBy(xpath = "(//div[text()='Continue'])[3]")
	WebElement continuebtn3;
	
	@FindBy(xpath="//div[@id='at_prepayment_close_icon']")
	WebElement paymentpopup;
	
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement cardno;
	
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement cardname;
	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement month;
	
	@FindBy(xpath = "//input[@id='card_exp_year']")
	WebElement year;
	
	@FindBy(xpath = "security_code")
	WebElement cvv;
	
	@FindBy(xpath = "Proceed to pay")
	WebElement proceedtopay;
	
	
	
	public RoundTripPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickRoundTrip() {
		
		roundtrip.click();
	}
	  public void clickDestination() {
		   	
			to.click();
			
		}
	    public void enterDestination() {
		   	
			destination.click();
			
		}
	    
	      
	    public void clickDeparturedate() {
	    	
	    	departuredate.click();
	    	
	    	
	}
	 public void selectTravelDate() throws InterruptedException {
			

	         Thread.sleep(1000);
	 		 traveldate.click();
	 		
	 	}
	 public void clickReturnDate() {
		 
		 returndate.click();
	 }
	 
	 public void selectTravelDate2() throws InterruptedException {
			

         Thread.sleep(1000);
 		 traveldate2.click();
 		
 	}
	 
	    

	    public void clickSearchFlight() throws InterruptedException {
	    	
	       
	        Actions act=new Actions(driver);
	        act.doubleClick(searchflight).perform();
	       
	    }
	  public void selectFlightPrice() {
	    	

	      Actions act=new Actions(driver);
	      act.doubleClick(flightprice).perform();
	     
	  }
	  public void clickContinue() {
	  	
		  Actions act=new Actions(driver);
	      act.doubleClick(continue_btn).perform();
	}
	  public void selectPassangerCheckbox() {
	  	
		  Actions act=new Actions(driver);
	      act.click(passanger_checkbox).perform();
	}
	  
	  public void clickContinueBtn2() {
		  	
		  	JavascriptExecutor j=(JavascriptExecutor)driver;
		  	j.executeScript("arguments[0].click();", continue_btn2);
		  	 Actions act=new Actions(driver);
		     act.doubleClick(continue_btn2).perform();
		  	
		  	
		}
	  public void clickPopupClose() {
		  	
		  Actions act=new Actions(driver);
		     act.click(popupclose).build().perform();
		  	
		  	
		}
	  
	  public void clickPopupClose2() {
		  	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  	wait.until(ExpectedConditions.elementToBeSelected(popupclose2));
		      Actions act=new Actions(driver);
		     act.click(popupclose2).perform();
		  	
		  	
		}
	  public void SkipPopup() {
		  	
		  Actions act=new Actions(driver);
		     act.click(skippopup).build().perform();
		  	
		  	
		}
	  public void clickContinueBtn3() {
		  	
		  Actions act=new Actions(driver);
		     act.click(continuebtn3).build().perform();
		  	
		  	
		}
	  public void PaymentPopup() {
		  	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  	wait.until(ExpectedConditions.elementToBeSelected(paymentpopup));
		      Actions act=new Actions(driver);
		     act.click(paymentpopup).perform();
		  	
		  	
		}
	  public void enterCardNumber() {
		  	driver.switchTo().frame(1);
		 cardno.sendKeys("52623598746123");
		  	
		}
	  public void enterCname() {
		  
		  driver.switchTo().frame(2);	
		 cardname.sendKeys("Test");
		  	
		}
	  
	public void enterCMonth() {
		  
		  driver.switchTo().frame(3);	
		 month.sendKeys("05");
		  	
		}
	public void enterCYear() {
		  
		  driver.switchTo().frame(5);	
		year.sendKeys("2035");
		  	
		}

	public void enterCvv() {
		  
		  driver.switchTo().defaultContent();
		cvv.sendKeys("1234");
		  	
		}
	public void clickProceedToPay() {
	  	
		  Actions act=new Actions(driver);
		     act.click(proceedtopay).build().perform();
		  	
		  	
		}

	
	

   

  
}

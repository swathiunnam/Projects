package pageobjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class SignupPage extends ProjectSpecification{
	
	@FindBy(xpath = "//div[text()='Signup']")
	WebElement signupButton;
	
	@FindBy(xpath="(//select[contains(@class,'form-control')])[1]")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstname;
	 
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="(//select[contains(@class,'form-control')])[2]")
	WebElement country;
	
	@FindBy(id = "dobDate")
	WebElement dob;
	
	@FindBy(className="react-datepicker__year-select")
	WebElement year;
	
	@FindBy(className = "react-datepicker__month-select")
	WebElement month;
	
	@FindBy(xpath = "//div[text()='10']")
	WebElement date;
	
	@FindBy(xpath="//div[text()='Phone']/following::input[1]")
	WebElement mobileno;
	
	@FindBy(id="email_id")
	WebElement email;
	
	@FindBy(id="new-password")
	WebElement password;
	
	@FindBy(id="c-password")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
   

	public SignupPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickSignup() {
		
	     signupButton.click();
	}

	
	 public SignupPage switchWindow() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Set<String> windowids=driver.getWindowHandles();
			List<String> l=new ArrayList<String>(windowids);
			driver.switchTo().window(l.get(1));
			return new SignupPage(driver);
			
		
	    }
	
	
	public void selectTitle() {
	
	    
		Select titleDropDown=new Select(title);
		titleDropDown.selectByVisibleText("Mrs");
		title.click();
		
	}
	
	public void enterFirstName() {


		firstname.sendKeys("Test");
		
	}
	
    public SignupPage enterLastName() {
    
 		
		lastname.sendKeys("user");
		return this;
	}
    
   public void selectCountry() {
	 
		 Select coutryDropDown=new Select(country);
	    coutryDropDown.selectByVisibleText("Benin");
	
	}
   
  public void clickOnCalender() throws InterruptedException {
	 Thread.sleep(1000); 
     /* WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.elementToBeClickable(dob));*/
	  dob.click();
  }
   
  public void selectYear() {
	  
	  year.click();
	  Select yearDropDown=new Select(year);
	  yearDropDown.selectByVisibleText("1996");
	    
  }
  
  public void selectMonth() {
	   
	   Select monthDropDown=new Select(month);
	   monthDropDown.selectByVisibleText("March");
   
  }
  
  
  public void selectDate() {
	  
	 date.click();
     
  }

   public void enterMobileNo() {
	
		
		mobileno.sendKeys("9000000000");
		
	}
   
   public void enterEmail() {
		
	  
		email.sendKeys("Testuser123@gmail.com");
		
	}
   
   public void enterPassword() {
	   
	  
		password.sendKeys("Test@123456");
		
	}
   
   public void confirmPassword() {
	  
	 
		confirmPassword.sendKeys("Test@123456");
		
	}
   public void clickOnSubmit() {
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(submit));
	   submit.click();
	
   }
   }

package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class LoginPage extends ProjectSpecification{
	
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement phoneno;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement login;
	
  public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLogin() {
		
		loginButton.click();
		
	}
  public void enterPhoneno() {
	
	phoneno.sendKeys("9123456789");
	
}
  public void enterPassword() {
	
	password.sendKeys("Test@123456");
	
}

public void clickOnLogin() {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(login));
	 Actions act=new Actions(driver);
     act.doubleClick(login).perform();
	login.click();
}

}

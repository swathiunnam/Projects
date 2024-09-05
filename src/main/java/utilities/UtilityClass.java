package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class UtilityClass {
	
	public static WebDriver driver;
	
	public void launch() {
		
		String browsername="chrome";
		if(browsername.equals("chrome")) {
			//launch only chrome browser
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			//launch only firefox browser
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("edge")) {
			//launch only Edge browser
			driver=new EdgeDriver();
		}
		else if(browsername.equals("safari")) {
			//launch only safari browser
			driver=new SafariDriver();
		}
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public static void browser(String browser) {
		
		switch (browser) {
		case "Chrome":
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-notifications");
			option.addArguments("disable-geolocation");
			driver=new ChromeDriver(option);
			break;
			
          case "Firefox":
			
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("disable-notifications");
			options.addArguments("disable-geolocation");
			driver=new FirefoxDriver(options);
			break;

		default:
			break;
		}
	}
	 public  static String getScreenshot(String testname) throws IOException {
		 
			File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotfilepath=System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
			FileUtils.copyFile(srcScreenshot, new File(screenshotfilepath));
			return screenshotfilepath;	
	 }		
	
	public void close() {
		
		driver.quit();
	}
	
}



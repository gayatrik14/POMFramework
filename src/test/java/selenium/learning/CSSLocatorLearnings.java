package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatorLearnings {
	
	WebDriver driver =null;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void cssLearning() {
		driver.get("https://www.facebook.com/login.php/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd.1@gmail.com");
		
		
	}
	
	@AfterMethod
	public void close() {
	//	driver.quit();
	}

}

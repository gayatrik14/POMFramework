package waitsLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsLearn {
	
	WebDriver driver;
		@BeforeMethod
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
	@Test
	public void implictWait() {	
		driver.get("https://www.google.com/");
		
		//Implicit wait is common for all the webelements for that particular driver instance		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("implict wait");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		
		
	}
	@Test
	public void explictWait() {
		driver.get("https://www.google.com/");
//Explicit wait is applicable for a particular webelement and it will throw an expected until a certain condition is not met
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

		driver.findElement(By.name("q")).sendKeys("selenium \n");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		

	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	}

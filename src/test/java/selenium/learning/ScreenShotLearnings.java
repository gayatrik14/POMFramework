package selenium.learning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotLearnings {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void takeScreenShot() {
		
		try {
			driver.get("https://www.google.com/");
			
			//take screenshot and return as a file
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//Destination path for the file to get stored
			
			File dest = new File("C:\\Users\\Satish Yadav\\OneDrive\\Desktop\\New folder\\google.png");
			
			//copying the file from source to destination
			
			FileUtils.copyFile(src, dest);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
	}

}

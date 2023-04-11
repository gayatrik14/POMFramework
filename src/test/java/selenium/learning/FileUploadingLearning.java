package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingLearning {

	WebDriver driver=null;
	
	
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void fileUpload() {
		try {
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Satish Yadav\\OneDrive\\Desktop\\xpath learning.txt");
		driver.findElement(By.id("file-submit")).click();
		
		if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded successfully");
			
		}
		else {
			System.out.println("file uploading failed");
		}
	
	}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
	}

}

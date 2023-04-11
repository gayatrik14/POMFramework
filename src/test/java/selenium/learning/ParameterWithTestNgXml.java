package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterWithTestNgXml {
	
	WebDriver driver= null;
	
	@BeforeMethod(alwaysRun=true)
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test
	@Parameters({"url", "searchTerm"})
	public void SearchInGoogle(String urlName, String searchText) throws InterruptedException
	{
		driver.get(urlName);
		
		driver.findElement(By.name("q")).sendKeys(searchText);
		
		Thread.sleep(2000);
	}
	
	

	@AfterMethod (alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}

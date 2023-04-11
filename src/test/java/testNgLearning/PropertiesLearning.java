package testNgLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesLearning {
	
	@Test
	public void propertylearning() throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"//config.properties");
		
		Properties prop = new Properties();
		prop.load(fp);
		
		String browser = (String) prop.getProperty("browser");
		WebDriver driver;
		
		if(browser.contentEquals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = (String) prop.getProperty("url");
			//driver.get("https://www.google.com");
			driver.get(url);
			
			String keyword = (String) prop.getProperty("keyword");
			WebElement ele = driver.findElement(By.name("q"));
			ele.sendKeys(keyword);
			
		}
		else if(browser.contentEquals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		
		
		
		
	}
	

}

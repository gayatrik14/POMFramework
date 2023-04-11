package selenium.learning;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTheNumberOfLinks {

	@Test
	public void links() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selenium learnings \n");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The total number of links  :" +links.size());
		
		for(WebElement hreflinks : links) {
			
			System.out.println(hreflinks.getAttribute("href"));
		}
		
	}
}

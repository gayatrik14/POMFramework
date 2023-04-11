package selenium.learning;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {
	@Test
	public void dropdown() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/dropdown.html");
		WebElement element = driver.findElement(By.id("Fruits"));
		Select dd = new Select(element);
		// dd.selectByIndex(1);
		// dd.selectByVisibleText("Apple")
		dd.selectByValue("apple");
		// Thread.sleep(3000);
		// dd.selectByIndex(2);
		// Thread.sleep(3000);
		// dd.selectByIndex(3);
		}



	@Test
	public void multipledd() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/dropdown.html");
		WebElement element = driver.findElement(By.name("Fruitss"));
		Select dd = new Select(element);
		dd.selectByIndex(1);
		// dd.selectByVisibleText("Apple")
		// Thread.sleep(3000);
		//	dd.selectByIndex(2);
		// Thread.sleep(3000);
		dd.selectByIndex(3);
		List<WebElement> list = dd.getOptions();
		for (WebElement options : list) {
			System.out.println(options.getText()+options.isSelected());

		}
	}
	
	@Test
	public void multipleddlearning() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/dropdown.html");
		WebElement element = driver.findElement(By.name("Fruitss"));
		Select dd = new Select(element);
		//dd.selectByIndex(2);
		 dd.selectByVisibleText("Apple");
		// Thread.sleep(3000);
		//	dd.selectByIndex(2);
		// Thread.sleep(3000);
		dd.selectByIndex(3);
		

		}
	}
	
package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsLearningByMe {
	
	@Test
	public void alertsInfoHandlingByMe() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");
		WebElement element = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void decisionMakingAlertsByMe() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
		element.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Alert text is : "+text);
		driver.switchTo().alert().accept();
	}
	@Test
	public void decisionAlertsByMe() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
		element.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text is : "+text);
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("gayatri");
		driver.switchTo().alert().accept();
	}
}


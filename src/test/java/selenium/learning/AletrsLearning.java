package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AletrsLearning {

	@Test
	public void infoAlertHandling() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		Assert.assertTrue(element.isDisplayed());
		Assert.assertFalse(element.isDisplayed());
		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	
	@Test
	public void decisionMakingAlerts() throws Exception {

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
		String actualResult = driver.findElement(By.xpath("//p[@id='confirmdemo']")).getText();
		String expectedResult = "You Clicked on OK 8!";
	/*	if(actualResult.equals(expectedResult)) {
			System.out.println("The testcase is passed "+actualResult);
		}
		else
			System.out.println("the testcase is failed "+actualResult);
		*/
		Assert.assertEquals(expectedResult, actualResult);
		driver.quit();
		
	}
	@Test
	public void decisionAlerts() throws Exception {

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
		
		String actualResult= driver.findElement(By.xpath("//p[@id='promptdemo']")).getText();
		String expectedResult = "Hello gayatri! Welcome to Excel ITac....";
		/*if(actualResult.equals(expectedResult)) {
			System.out.println("The testcase is passed "+actualResult);
		}
		else
			System.out.println("the testcase is failed "+actualResult);
		*/
		Assert.assertEquals(expectedResult, actualResult);
		
		driver.quit();
	}
	
	@Test
	public void alertstrueExample1() throws Exception {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(
					"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");

			WebElement element = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
			Assert.assertTrue(element.isDisplayed());
			element.click();
			// Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.quit();
		}
	@Test
	public void alertsFalseExample1() throws Exception {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(
					"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/alerts.html");

			WebElement element = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
			Assert.assertFalse(element.isDisplayed());
			element.click();
			// Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.quit();
		}
		
	
	@Test
	public void displayed() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/StudentReg.html");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='email']//preceding::input[2]"));
		element.sendKeys("Gayatri");
		Thread.sleep(3000);
		
	
		element = driver.findElement(By.xpath("//input[@id='fname']//following::input[1]"));
		element.sendKeys("Yadav");
		

	}
	}

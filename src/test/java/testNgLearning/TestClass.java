package testNgLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;

	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@AfterMethod
	public void close() {

		driver.quit();

	}

	@Test
	public void testCase1() {

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selenium \n");
	}

	@Test
	public void testCase2() {

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("java \n");

	}

	@Test
	public void testCase3() {

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("gayatri \n");

	}

	@Test
	public void testCase4() {

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Testing \n");

	}
}

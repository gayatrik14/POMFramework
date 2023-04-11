package selenium.learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowsLearning {

	@Test
	public void switchWindowLearning() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/loginPage.html");

		WebElement ele = driver.findElement(By.name("uname"));
		ele.sendKeys("Gayatri");

		ele = driver.findElement(By.name("psw"));
		ele.sendKeys("12345678");

		String pWindow = driver.getWindowHandle(); // current page add

		WebElement password = driver.findElement(By.linkText("Reset Password"));
		password.click();

		Thread.sleep(3000);

		Set<String> handles = driver.getWindowHandles(); // next page add

		for (String adr : handles) { // to iterate b/w two pages
			if (!(pWindow.contentEquals(adr))) {

				driver.switchTo().window(adr);

			}
		}

		WebElement username = driver.findElement(By.name("funame"));
		username.sendKeys("nila");

		WebElement psw = driver.findElement(By.name("psw"));
		psw.sendKeys("123334567");

	}

}

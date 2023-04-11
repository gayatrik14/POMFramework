package assignments;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravels {
	@Test
	public void phpTravelsLearning() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");

		WebElement element = driver
				.findElement(By.xpath("//button[@class='nav-link text-start text-capitalize waves-effect active']"));
		element.click();

		element = driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']"));
		element.click();

		element = driver.findElement(By.xpath("//input[@role='searchbox']"));
		element.sendKeys("Chennai");

		element = driver.findElement(By.xpath("//input[@role='searchbox']"));
		element.click();

		 element = driver.findElement(By.xpath("//input[@class='checkin form-control form-control-lg border-top-r0']"));
		 element.click();

		// Thread.sleep(3000);

		// element = driver.findElement(By.xpath("//input[@class='checkout form-control
		// form-control-lg border-top-l0']"));
		// element.click();

	}

	@Test
	public void tableHandling() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");

		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> eachRow = table.findElements(By.tagName("tr"));
		System.out.println(eachRow.size());
	
		int i = 0;
		// WebElement next = driver.findElement(By.xpath("//a[@id='example_next']"));
		/*
		 * while (next.isDisplayed()) { if (i != 1) { next.click(); }
		 */

		for (WebElement ele : eachRow) {

			if (i == 0) {
				List<WebElement> header = ele.findElements(By.tagName("th"));

				for (WebElement tabHeader : header) {
					System.out.print(tabHeader.getText() + "\t" + "\t");
				}
				System.out.println();
				i++;
			}
			if (i == 1) {

				List<WebElement> noOfCols = ele.findElements(By.tagName("td"));
				for (WebElement text : noOfCols) {
					System.out.print(text.getText() + "\t" + "\t");
				}
				System.out.println();
			} 

		}
	}

	@Test
	public void tableHandlingBM() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		int i = 0;
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> eachRow = table.findElements(By.tagName("tr"));
		for (WebElement ele : eachRow) {
			if (i == 0) {
				List<WebElement> header = ele.findElements(By.tagName("th"));
				for (WebElement tableHead : header) {
					System.out.print(tableHead.getText() + "\t" + "\t" + "\t");
				}
				System.out.println();
				i++;

			}
			if (i == 1) {

				List<WebElement> noOfCols = ele.findElements(By.tagName("td"));
				for (WebElement text : noOfCols) {
					System.out.print(text.getText() + "\t" + "\t" + "\t");
				}
				System.out.println();
			}

		}
	}

	@Test
	public void entriesAssignment() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");

		WebElement element = driver.findElement(By.name("example_length"));
		Select dd = new Select(element);
		dd.selectByValue("100");

		Thread.sleep(3000);

		element = driver.findElement(By.xpath("//input[@type='search']"));
		element.sendKeys("2008");
		int flag = 0;
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> eachRow = table.findElements(By.tagName("tr"));
		for (WebElement ele : eachRow) {
			if (flag == 0) {
				List<WebElement> header = ele.findElements(By.tagName("th"));
				for (WebElement tableHeader : header) {
					System.out.print(tableHeader.getText() + "\t" + "\t" + "\t");

				}
				System.out.println();
				flag++;
			}

			if (flag == 1) {

				List<WebElement> colsRow = ele.findElements(By.tagName("td"));
				for (WebElement text : colsRow) {
					System.out.print(text.getText() + "\t" + "\t" + "\t");
				}
				System.out.println();

			}
		}

	}
}

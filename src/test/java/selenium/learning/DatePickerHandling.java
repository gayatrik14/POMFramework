package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerHandling {
	

	WebDriver driver ;

	@Test


	public void dpHandling() {

		String monthYear = "May 2029";
		String day = "21";
		
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println(currentMonth);

		WebElement next = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));

		while (true) {

			System.out.println(monthYear);
			System.out.println(currentMonth);
			if (monthYear.equals(currentMonth)) {
				break;
			} else
				next.click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
		WebElement dayToClick = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]"));
		dayToClick.click();

	}
	
	
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net");
	}
	@Test

	public void dpDmHandling(){
		
		
		String Year = "March 2023";
		String Day ="03";
		
		WebElement checkIn = driver.findElement(By.name("checkin"));
		checkIn.click();

		String currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr//th[@class='switch']")).getText();
		String currentDate = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tbody//td[@class='day  active']")).getText();
		
		
		System.out.println(currentMonth);
		System.out.println(currentDate);

		WebElement next = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));

		while (true) {

			System.out.println(Year);
			System.out.println(currentMonth);
			if (Year.equals(currentMonth) && Day.equals(currentDate)) {
				break;
			} else
				next.click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();
			currentDate = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tbody//td[@class='day  active']")).getText();
		}

	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}

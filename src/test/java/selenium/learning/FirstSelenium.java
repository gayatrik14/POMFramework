package selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {
	
	@Test
	public void sel() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		/*
		 * Object > WebElement you are locating n he browse 
		 * action > type a text in the text box 
		 * 
		 * driver.findElement(By.
		 * 
		 * 
		 * 
		 */
		
		WebElement element =  driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("java /n");
	}
	
	
@Test
public void html() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/LearningWorkSpace/UIFrameworkLearning/src/test/java/selenium/learning/htmlfiles/StudentReg.html");
		
		/*
		 * Object > WebElement you are locating n he browse 
		 * action > type a text in the text box 
		 * 
		 * driver.findElement(By.
		 * 
		 * 
		 * 
		 */
		
	

		
		WebElement element = driver.findElement(By.name("fname"));
		
		element.sendKeys("Gayatri");
		
	 element=driver.findElement(By.name("lname"));
	element.sendKeys("Yadav ");
	
	
	driver.findElement(By.name("email")).sendKeys("abc.123@gmail.com");
	 driver.findElement(By.id("male")).click();		
	
	driver.findElement(By.name("address")).sendKeys("Bangalore");
	}

@Test
public void xpathLearning() {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	WebElement element = driver.findElement(By.xpath("//a[@href ='https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F']"));
	element.click();
	
	
	
//	element = driver.findElement(By.xpath("//span[@id='gh-ug-flex']"));
//	element.click();
	
	
	
	
	
	
	
/* element=driver.findElement(By.xpath("//input[@name='lname']"));
element.sendKeys("Yadav ");


driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc.123@gmail.com");
 driver.findElement(By.xpath("//[@id='male']")).click();		

driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Bangalore");
}
*/



}









@Test
public void sauce() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	/*
	 * Object > WebElement you are locating n he browse 
	 * action > type a text in the text box 
	 * 
	 * driver.findElement(By.
	 * 
	 * 
	 * 
	 */
	
	WebElement element = driver.findElement(By.name("user-name"));
	element.sendKeys("standard_user");
	
	element=driver.findElement(By.name("password"));
	element.sendKeys("secret_sauce");
	
	element=driver.findElement(By.name("login-button"));
	element.click();
	
	element=driver.findElement(By.className("inventory_item_name"));
	element.click();
	
	Thread.sleep(3000);
	
	element=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
	element.click();
	
	element=driver.findElement(By.name("back-to-products"));
	element.click();
	
	element=driver.findElement(By.id("item_1_title_link"));
	element.click();
	element=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
	element.click();
	
	element=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
	element.click();
	
	
	element=driver.findElement(By.className("shopping_cart_link"));
	element.click();
	
	//element=driver.findElement(By.id("checkout"));
	//element.click();
	
}




}























//https://phptravels.net/

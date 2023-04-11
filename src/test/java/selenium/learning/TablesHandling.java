package selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesHandling {
	
	@Test
	public void webTable() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		System.out.println("No of Rows in the webtable : "+tableRows.size());
		
		//for(CollectionType individualele:collections)
		int i=0;
		
		for (WebElement eachRow:tableRows)
		{
			if(i==0)
			{
				List<WebElement> tableHeader =eachRow.findElements(By.tagName("th"));
				
				for(WebElement eachHeader:tableHeader)
				{
					System.out.print(eachHeader.getText()+"\t" + "\t");
				}
				System.out.println();
				i++;
				
			}
			
			if(i==1)
			{
				List<WebElement> tableData= eachRow.findElements(By.tagName("td"));
				
				for(WebElement eachTableData:tableData)
				{
					System.out.print(eachTableData.getText()+"\t"+"\t");
				}
				System.out.println();
			}
		}
		
	}
	
	@Test
	public void webTableNameCol() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		
		
	
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
	//	WebElement ele = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		List<WebElement> tableRow = table.findElements(By.tagName("tr"));
		System.out.println(tableRow.size());
	int i=0;
		for(WebElement oneRow: tableRow ) {
			if(i ==0) {
				List<WebElement> thead = oneRow.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
				
				for(WebElement eachCol :thead) {
					
					System.out.print(eachCol.getText()+"\t" + "\t");
					
				}
				System.out.println();
				i++;
				}
			
			if(i==1)
			{
				List<WebElement> tableData= oneRow.findElements(By.tagName("td"));
				
				for(WebElement eachTableData:tableData)
				{
					System.out.print(eachTableData.getText()+"\t"+"\t");
				}
				System.out.println();
			}
			}
		
	}
}


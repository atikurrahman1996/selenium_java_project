package webdriverautomation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day14_HandleWebTable {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		// How many rows in Table 
		
		
	    List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("The number of rows in the table: "+rows.size());    
		
		// How many column in Table 
		
        List<WebElement> column = driver.findElements(By.xpath("//*[@id='leftcontainer']//table//thead//tr//th"));
		
		System.out.println("The number of column in the table: "+column.size()); 
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//To find third row of table
		
		 WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		 
         String rowtext = tableRow.getText();
         
		 System.out.println("Third row of table : "+rowtext);
		 
		    
		    //to get 3rd row's 2nd column data
		  WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		  
		  String valueIneed = cellIneed.getText();
		  
		  System.out.println("Cell value is : " + valueIneed); 
		 
		

	}

}

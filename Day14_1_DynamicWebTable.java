package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day14_1_DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		
		// login
		
		
		WebElement userInputbox = driver.findElement(By.id("input-username"));
		
		userInputbox.clear();
		userInputbox.sendKeys("demo");
		
       WebElement userPassword = driver.findElement(By.id("input-password"));
		
       userPassword.clear();
       userPassword.sendKeys("demo");
		
       driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")).click();
       
       
       
       Thread.sleep(3000);
       // after login > close pop up> go to sales section > click > select orders > click
       
       driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[@id='modal-security']/div[1]/div[1]/div[1]/button[1]")).click();
       
       driver.findElement(By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-sale']/a[1]")).click();

       driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
       
       Thread.sleep(3000);
       // find text of the pages
       
       String text = driver.findElement(By.xpath("//div[contains(text(),'Showing 1 to 10 of 141 (15 Pages)')]")).getText();
       
       System.out.println("Total page of the webpage is: "+text);
       
       Thread.sleep(3000);
       // finding total numbers of pages
       
       int totalPages = Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
       
       System.out.println("total number of pages is: "+ totalPages);
       
       

       
       
       
       
       
       
	}
	
}



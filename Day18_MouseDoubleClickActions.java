package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day18_MouseDoubleClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
	    WebElement field1=	driver.findElement(By.id("field1"));
	
	    field1.clear();
		
		field1.sendKeys("Welcome to Selenium");
		
		
	   WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	
	   Actions act = new Actions(driver);
	
	   act.doubleClick(button).perform();  // Performs the double click actions

		
	}

}

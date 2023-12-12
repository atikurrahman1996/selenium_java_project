package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10_JavaScript_Alerts_Popups_Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		
		/*
		
		// Alert window with Ok click
		
		WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		
		alertButton.click();
		
		
		// Alert Text
		
		String alertTitle = driver.switchTo().alert().getText();
		
		System.out.println(alertTitle);
		
		
		driver.switchTo().alert().accept();
		
		*/
		
		/*
        
        // Confirm Button with cancel 
		
		
       WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		
		confirmButton.click();
		
		
		// Alert Text
		
		String confirmTitle = driver.switchTo().alert().getText();
		
		System.out.println(confirmTitle);
		
		
		driver.switchTo().alert().dismiss(); 
		
		
		
		// Confirm button with Ok
		
		
       WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		
		confirmButton.click();
		
		
		// Alert Text
		
		String confirmTitle = driver.switchTo().alert().getText();
		
		System.out.println(confirmTitle);
		
		
		driver.switchTo().alert().accept();  
		
		
		*/
        
        
		// Prompt alert 
		
		
       WebElement promptButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		
		promptButton.click();
		
		
		// Alert Text
		
		String promptTitle = driver.switchTo().alert().getText();
		
		System.out.println(promptTitle);
		
		// Write something 
		
		driver.switchTo().alert().sendKeys("Test Automation");
		
		// Click ok 
		
		driver.switchTo().alert().accept();
		
		

	}

}

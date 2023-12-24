package webdriverautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day25_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        //driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		driver.manage().window().maximize();
		
		
			/*
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		
	*/
		
		driver.get("https://text-compare.com/");
		
		WebElement inputBox1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement inputBox2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		inputBox1.sendKeys("Welcome to Selenium");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		// ctrl+a 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(3000);
		// ctrl+c 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		// tab > shift to input box 2
				
		act.sendKeys(Keys.TAB);
		act.perform();
				
		Thread.sleep(3000);
			// ctrl+v
				
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//comapare text 
		
		
		if(inputBox1.getAttribute("value").equals(inputBox2.getAttribute("value"))) 
			System.out.println("Text copied successfully");
			
		else
			System.out.println("Text is not copied");
			
			
			
			
		
				
				
				
		
		

	}

}

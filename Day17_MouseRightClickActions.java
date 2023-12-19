package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day17_MouseRightClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();  // Open Browser
		
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		driver.manage().window().maximize();
		
		
	   WebElement button =	driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	
	   Actions act = new Actions(driver);
	
	   act.contextClick(button).perform();  // Right click action 

	}

}

// any kind of mouse related actions we need to use " Actions" method > Actions act = new Actions(driver)
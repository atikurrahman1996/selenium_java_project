package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day15_MouseDragDropActions {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();  // Open Browser
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		
		/*
        WebElement oslo = driver.findElement(By.id("box1"));
		
		WebElement norway = driver.findElement(By.id("box101"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(oslo, norway).perform();   // Perform drag and drop
		*/
		
		
        WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(rome, italy).perform();   // Perform drag and drop
		
		

	}

}

package webdriverautomation;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day27_RobotClassKeyboardEvents {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://spreadsheetpage.com/calendar/weekly/");
        
        driver.manage().window().maximize();
        
        //Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[normalize-space()='Download this template for free']")).click();
        
        /*
        // using robot class where to save file
        
        // down arrow > 3 times tab key > enter 
        
        //Instantiate Robot Class
      
        Robot robot = new Robot();
        
         Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);  // press down arrow key of Keyboard
        
         Thread.sleep(3000);
         
        robot.keyPress(KeyEvent.VK_TAB);   // tab key
        
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        
        Thread.sleep(3000);
        
        robot.keyPress(KeyEvent.VK_ENTER);  // enter key 
        
        
        */
        

	}

}




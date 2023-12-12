package webdriverautomation;

import java.util.Set;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_HandleBrowserWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://www.automationpractice.pl/index.php");
        
        driver.manage().window().maximize();
		
		
            // getWindowHandle:
		
     		//String windowID = driver.getWindowHandle();    // Return ID of the single browser window
     		
     		//System.out.println(windowID);    // output- CDwindow-12AFD20A17A13FDA2EBDEBBD70F75968
        
          String parentGUID = driver.getWindowHandle();    // Return ID of the single browser window
		
		  //System.out.println(parentGUID);    // output- CDwindow-12AFD20A17A13FDA2EBDEBBD70F75968
		
		  String parentTitle =driver.getTitle();
		
		  System.out.println("Parent first Title: "+parentTitle);
		  
		
		  // open another browser window (child window)
		 
     		
     	  WebElement childWindow = driver.findElement(By.xpath("//a[contains(text(),'My orders')]"));
     	  childWindow.click();
     		
     	  //String childGUID = driver.getWindowHandle();    // Return ID of the single browser window
 		
		  //System.out.println(childGUID); 
		  
		  //String childTitle =driver.getTitle();
			
		  //System.out.println("Child first Title: "+childTitle);
		  
		  
		//getWindowHandles
			
			Set <String> allGUID=driver.getWindowHandles();  // Return IDs of multiple windows 
			
			
			// Switch to child window
			
			for(String childGUID:allGUID) {
				
			driver.switchTo().window(childGUID);
			
			driver.navigate().to("https://www.google.com/");
			
			String childTitle = driver.getTitle();
			
			System.out.println(childTitle);
			
		    break;
			
			}
				


			// Switch back to the parent window
			
	        driver.switchTo().window(parentGUID);
	        driver.navigate().to("https://www.amazon.com/");
	        String parentSecondTitle = driver.getTitle();
	        System.out.println("Parent Second Title: " + parentSecondTitle);
		
     
     	    // driver.close();     // close single browser 
     		
     		//driver.quit();      // close all browser
     		 
     		 
		

	}

}

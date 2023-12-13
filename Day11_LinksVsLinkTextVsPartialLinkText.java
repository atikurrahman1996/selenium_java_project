package webdriverautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day11_LinksVsLinkTextVsPartialLinkText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
        driver.get("https://www.amazon.com/");
        
        // LinkText
        
        //driver.findElement(By.linkText("Today's Deals")).click();
        
        
        // partial linkText
        
        //driver.findElement(By.partialLinkText("Today's Dea")).click();
       // driver.findElement(By.partialLinkText("Deals")).click();
        
     
        // How to captured all the links from the web page
		
		
     	List <WebElement> links = driver.findElements(By.tagName("a"));
     		
     	System.out.println("The number of links: "+links.size());    // output 329
     	
     	
     /*
     	// using for loop
     	
		
     for(int i=0; i<=links.size(); i++){
    	 
     	System.out.println(links.get(i).getText());
     	  
     	//System.out.println(links.get(i).getAttribute("href")); 
     }
     	
     	
       */ 
		
		
		
	
		

	}

}

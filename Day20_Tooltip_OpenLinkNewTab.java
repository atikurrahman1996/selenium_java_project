package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day20_Tooltip_OpenLinkNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*
		// captured toolTip Text
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  // only one frame present in this website 
		
		WebElement inputBox = driver.findElement(By.id("age"));
		String toolTipBox = inputBox.getAttribute("title");
		
		System.out.println(toolTipBox);
		
		
		*/
		
		
		// open link in the new tab
		
        driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		String tab= Keys.chord(Keys.CONTROL, Keys.RETURN);
		
		
		//driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		
		
		/*
		// open URL's in multiple tab and windows 
		
		
		// Open the first URL
        driver.get("https://demo.nopcommerce.com/");

        // Open a new tab/window and navigate to the second URL
        
        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://www.opencart.com/");

        // Perform any additional actions if needed

        // Close the browser
        //driver.quit();
		*/
	}

}

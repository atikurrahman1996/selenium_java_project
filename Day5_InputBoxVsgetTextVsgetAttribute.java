package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_InputBoxVsgetTextVsgetAttribute {

	public static void main(String[] args) {
		
		// using webdriver manger if we use webdriver manager we don't need to give driver location
		
		// Test case: How to enter & clear Input Box, captured TextBox, getTex Vs getAttributes
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailInputBox = driver.findElement(By.id("Email"));
		
		//emailInputBox.clear();                   // Clear the current email 
		//emailInputBox.sendKeys("atikur2018rahman@gmail.com");  // again input this email
		
		
		// capturing text/get attribute value  // getText use for inner text capturing
		
		System.out.println("Result from getAttribute is:"+emailInputBox.getAttribute("value"));  // output admin@yourstore.com
		
		System.out.println("Result from getText is:"+emailInputBox.getText());   // output empty 
		
		
		// Login button  // getText use for inner text capturing
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		
	   System.out.println(button.getAttribute("type"));
	   System.out.println(button.getAttribute("class"));
	   
	   System.out.println(button.getText());
		
		
		// Title 
	   
	   String title = driver.findElement(By.xpath("//h1[contains(text(),'Admin area demo')]")).getText();
	   
	  System.out.println(title);
		
		

	}

}

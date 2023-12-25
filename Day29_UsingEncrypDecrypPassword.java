package webdriverautomation;

import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day29_UsingEncrypDecrypPassword {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
       
        driver.manage().window().maximize();
        
        
      WebElement userInputbox = driver.findElement(By.id("input-username"));
		
		userInputbox.clear();
		userInputbox.sendKeys("demo");
		
       WebElement userPassword = driver.findElement(By.id("input-password"));
		
       userPassword.clear();
       userPassword.sendKeys(decodeString("ZGVtbw=="));
		
       driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")).click();

	}
	
	 static String decodeString(String password) {
	  byte[] decodedString = Base64.decodeBase64(password);
	  return(new String(decodedString));

	 }
	
	
	
	
	
	
	
	
	
	
	
	

}

package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day26_AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        //driver.get("https://the-internet.herokuapp.com/basic_auth"); // This url will open popup window 
		
		
		// syntext > https:// username:password@url
		
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // login > go to homepage
		
		driver.manage().window().maximize();
		
		// syntext > username:password@url
		
		String text = driver.findElement(By.cssSelector("div[class='example'] p")).getText();
		
		System.out.println(text);
		
		
		
		
		
	}

}

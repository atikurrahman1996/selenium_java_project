package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day23_DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://testingbot.com/security");  
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("//a[contains(text(),'Download our Security Whitepaper')]")).click();

	}

}

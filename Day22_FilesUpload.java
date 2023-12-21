package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day22_FilesUpload {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.foundit.in/");  
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//body/div[@id='themeDefault']/section[1]/div[1]/div[3]/div[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\SQA\\OneDrive\\Desktop\\Selenium Cheat Sheet.pdf");
		
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='pop_upload']")).click();

	}

}

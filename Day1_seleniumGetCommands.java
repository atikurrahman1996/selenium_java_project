package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_seleniumGetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();  // Open Browser
		
		driver.get("https://eudika.com/en");   // Open URL
		
		
		driver.manage().window().maximize();
		
		System.out.println("Current Title of the webpage is: "+driver.getTitle());
		
		System.out.println(" Current URL of the webpage is: "+driver.getCurrentUrl());
		


	    driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("atikur2017rahman@gmail.com");
	    
	    driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/button")).click();
	    

	}

}

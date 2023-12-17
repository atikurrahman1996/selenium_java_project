package webdriverautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Day13_ImplicitWaitExplicitWait {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		
		
		// Implicit Wait
		
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // It shows error

				
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		driver.findElement(By.name("q")).sendKeys("Selenium");
				
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  // enter the selenium 
				
		driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();
		
		
		
		
		/*
       // Explicit Wait 
		
		
        WebDriverWait myWait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  
		
	    //WebElement element =myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")));
	    
		WebElement element = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")));
	    element.click();
		
		
		*/
		
		
	}

}

package webdriverautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day19_TakesScreenShoots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		/*
		// Take Full page screenshot
		
				
		TakesScreenshot ts =(TakesScreenshot)driver;
				
		File src = ts.getScreenshotAs(OutputType.FILE);
				
		File target = new File(".\\screenshoots\\homepage.png");
		
		FileUtils.copyFile(src, target);
		*/
		
		
		// Take Specific section screenshots
		
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);

		
		WebElement section = driver.findElement(By.xpath("//body/footer[1]/div[1]"));
		
		File src = section.getScreenshotAs(OutputType.FILE);
				
		File target = new File(".\\screenshoots\\featuredProducts.png");
		
		FileUtils.copyFile(src, target);
		
				
				
	    //driver.close();

	}

}

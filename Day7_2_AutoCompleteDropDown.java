package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_2_AutoCompleteDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		searchBox.clear();
		
		Thread.sleep(3000);
		
		searchBox.sendKeys("Toronto");
		
		// to read auto search value
		
		String text;
		
		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			text=searchBox.getAttribute("value");
			
			if(text.equals("Toronto, ON, Canada")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			
			Thread.sleep(3000);
			
		} while(!text.isEmpty());
		
		
		
		

	}

}

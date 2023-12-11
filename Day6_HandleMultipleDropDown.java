package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_HandleMultipleDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// handle single drop down
		
		/*
        driver.get("https://www.opencart.com/index.php?route=account/register");
		
		
		// selectByVisibleText() //selectByValue //selectByIndex
		
		WebElement dropdownCountryEle= driver.findElement(By.id("input-country"));
		
		
		Select dropdownCountry=new Select(dropdownCountryEle);
		
		
		dropdownCountry.selectByVisibleText("Bangladesh");
		
		dropdownCountry.selectByValue("18");   // Output Bangladesh 
		
		dropdownCountry.selectByIndex(38);     // Canada
		
		*/
		
		// handle multiple drop down
		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
        Select noOfEmpsdrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		
		noOfEmpsdrp.selectByVisibleText("16 - 20");  
		
		
        Select countryDrp=new Select(driver.findElement(By.name("Country")));
		
		countryDrp.selectByVisibleText("Bangladesh");
		
		

	}

}

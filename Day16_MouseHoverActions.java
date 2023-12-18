package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day16_MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();  // Open Browser
		
        driver.get("https://demo.opencart.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement desktopsMenu=driver.findElement(By.xpath("//body/main[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
		//desktopsMenu.click();
		
		
		WebElement tabletMenuItem=driver.findElement((By.xpath("//a[contains(text(),'Tablets')]")));
		//tabletMenuItem.click();
		
        Actions act =new Actions(driver);
		
		act.moveToElement(desktopsMenu).moveToElement(tabletMenuItem).click().perform();
		
		

	}

}

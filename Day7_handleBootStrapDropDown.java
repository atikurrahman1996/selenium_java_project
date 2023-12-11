package webdriverautomation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day7_handleBootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");


	       // First we have to click on menu item then only dropdown items will display

	    driver.findElement(By.xpath("//button[@id='menu1']")).click();



	       // adding 2 seconds wait to avoid Sync issue

	       Thread.sleep(2000);



	       // Dropdown items are coming in <a> tag so below xpath will get all
	       

	       // elements and findElements will return list of WebElements

	       List<WebElement> list = driver.findElements (By.xpath("//ul[@class='dropdown-menu']//li/a"));



	       // We are using enhanced for loop to get the elements
	       
	       for (WebElement ele : list)

	       {

	          // for every elements it will print the name using innerHTML

	          System.out.println("Wel Elements Values is: " + ele.getAttribute("innerHTML"));

	       
	       }

	}

}

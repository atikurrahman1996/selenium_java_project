package webdriverautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_checkWebElementsEnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();  // Open Browser
		
		driver.get("http://hrd.smef.gov.bd/index.php/participant/index/505");
		
	
		driver.manage().window().maximize();
		
		// check elements isDisplayed() ,  isEnabled()
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='mob']"));
		
		System.out.println("Display status:" +textBox.isDisplayed());   // display status true
		System.out.println("Display status:"+textBox.isEnabled());
		
	
		
		// isSelected   for check radio buttons, check boxes, drop down
		
		WebElement radioButton = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/form[1]/div[4]/div[3]/div[1]/div[5]/input[1]"));
		
		System.out.println("Radio Selected Satus:"+radioButton.isSelected());  // false 
		
		
		WebElement male = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/form[1]/div[4]/div[3]/div[1]/div[5]/input[1]"));
		
		WebElement female = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/form[1]/div[4]/div[3]/div[1]/div[5]/input[2]"));
		
		System.out.println(male.isSelected());    // False 
	    System.out.println(female.isSelected());  // False 
	    
	    male.click();
	    
	    System.out.println(male.isSelected());    // True 
	    System.out.println(female.isSelected());  // False
	    
	    female.click();
	    
	    System.out.println(male.isSelected());    // False
	    System.out.println(female.isSelected());  // True

	}

}

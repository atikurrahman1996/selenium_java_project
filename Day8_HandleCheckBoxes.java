package webdriverautomation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day8_HandleCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
        driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		//Select specific check boxes 
		//driver.findElement(By.cssSelector("#monday")).click();
		
		//Select all the check boxes
		
        List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println("The total number of check boxes: "+checkboxes.size());    // output 7
		
		
		// Using for lop 
		/*
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();              // output select all 7 boxes 
		}
		*/
		
		
		// Select multiple check boxes by choice // My choice is Monday and Sunday 
		
		
				for(WebElement chkbox:checkboxes)
				{
					String checkboxname =chkbox.getAttribute("id");
					
					if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
					{
						
						chkbox.click();
						
					}
					
					
				}
		
	
		
		
		
		
		

	}

}

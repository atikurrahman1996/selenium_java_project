package webdriverautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day24_DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		// month & year selection
		
		Select month_drp = new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		
		month_drp.selectByVisibleText("Jul");
		
        Select month_yr = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		
		month_yr.selectByVisibleText("1996");
		
		// date selection
		
        String date = "18";
        
        List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        
        for(WebElement ele:allDates) {
        	String dt = ele.getText();
        	if(dt.equals(date)) {
        		ele.click();
        		break;
        	}
        }
        
        
		
		
		
		
		
		
		
		/*
        driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		String year = "2023";
		String month = "July";
		//String date = "10";
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		// use while lop to pick the expected date
		
		Thread.sleep(1000);
		
		while(true) {
			String monthYear = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
			
			String arr[]= monthYear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
			break;
			
			else
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"));
			
		}
		
		*/
		
		
		
		
		
		
	}

}

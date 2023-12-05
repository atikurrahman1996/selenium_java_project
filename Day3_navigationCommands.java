package webdriverautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_navigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://connexpay.com/");   // open url 
		
		
		driver.navigate().to("https://www.i2gether.com/");  // open url 
		
		
		 //Remember- navigate.to() method and get() method are same (using for open the URL)
		// The difference between get() method & navigate.to()method:
				//Get() method is used to open URL and wait till page load but navigate.to()method open URL but doesn't wait page load 

		driver.navigate().back();       // Open ConnexPay Web page
		driver.navigate().forward();   // Open Together Initiatives
		
		driver.navigate().refresh();  // refresh or reload page 
		
		driver.quit();
		
		

	}

}

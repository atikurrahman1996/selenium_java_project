package webdriverautomation;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_1_HandlejQueryDropDown {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//selectChoiceValues(driver, "choice 1");
		//selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 3");
		selectChoiceValues(driver, "all");
		
		
		
	}
	
	public static void selectChoiceValues(WebDriver driver, String...value) {
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item: choiceList) {
				String text =item.getText();
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}
		
		else {
			for(WebElement item: choiceList) {
				item.click();
			}
		}
	}

}

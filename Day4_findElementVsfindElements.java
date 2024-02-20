package webdriverautomation;

public class Day4_findElementVsfindElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		// findElement -> return the Single Web element

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		searchbox.sendKeys("XYZ");

		// findElements -> returns multiple Web Element

		List<WebElement> links = driver.findElements(By.xpath("//div[@id='navFooter']//a"));

		System.out.println("The Number of Element Captured: " + links.size()); // output 69

		for (WebElement ele : links) {
			System.out.println(ele.getText());
		}
		

	}

}

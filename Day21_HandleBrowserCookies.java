package webdriverautomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day21_HandleBrowserCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		// Captured Cookies from the browser 
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("The Size of the cookies is:" + cookies.size());
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+": "+cookie.getValue());   // 3 cookies 
		}
		
		
		// Add cookies to the browser 
		
		Cookie cookieobj=new Cookie("My cookies123", "Your cookies325");
		
		driver.manage().addCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		
		System.out.println("Size of the cookies aftet adding:"+cookies.size());   // 4 cookies
		
		
		
		// delete cookies 
		
		driver.manage().deleteCookie(cookieobj);
		
		//driver.manage().deleteCookieNamed("My cookies123");
		
		cookies=driver.manage().getCookies();
		
		System.out.println("Size of the cookies aftet deleting:"+cookies.size());   // 3 cookies
		
		
		//Delete all cookies from the browser
		
        driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		
		System.out.println("Size of the cookies aftet deleting:"+cookies.size());   // 0
		
		driver.quit();
		
		

	}

}

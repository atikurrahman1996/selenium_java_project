package webdriverautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_HandleiFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		/*
		

        driver.get("https://demoqa.com/frames");
      
   
        WebElement frame1=driver.findElement(By.id("frame1"));         //Locating frame1 using its id
      
        driver.switchTo().frame("frame1");  //Switching the WebDriver context to frame1
        
        WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));       //Identifying the heading in webelement
        
        String frame1Text=frame1Heading.getText();
        
        System.out.println("Text of the frame1 heading is:"+frame1Text);
        
       */
		
   /*
        //Switching to iframe through ID:
		
		
		driver.get("https://demo.guru99.com/test/guru99home/"); 
	     
	    driver.manage().window().maximize();
	    
	    //Switching to iframe through ID:
	    
	    driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		System.out.println("We are switch to the iframe");
		
  		driver.findElement(By.xpath("//body//a//img")).click();
  		
		System.out.println("We are done");
	*/
		
	//Switch to the frame by Web Element  //switch back to the Main Frame > driver.switchTo().parentFrame(); or driver.switchTo().defaultContent();
		
		driver.get("https://demo.guru99.com/test/guru99home/"); 
	    
	    //int totalFrameSize = driver.findElements(By.tagName("iframe")).size();
	    //System.out.println("Total iframes on Page:"+totalFrameSize);
	    
	  //Commented the code for finding the index of the element, remember that index 0> iframe 1 , index 1> iframe 2
	    
   /*
        for(int i=0; i<=totalFrameSize; i++){
	    	
		driver.switchTo().frame(i);
		
		int total=driver.findElements(By.xpath("//body//a//img")).size();
		
		System.out.println(total);
		
	    driver.switchTo().defaultContent();
	    
	    }
	    */
	    
	    driver.switchTo().frame(1); //Switching to the frame
	    
		System.out.println("We are switched to the iframe");
		
		driver.findElement(By.xpath("//body/a[1]/img[1]")).click();  // click the advertisement frame
		
	    System.out.println("We are done");
	    
	   
	
	    //driver.switchTo().frame(0); remember that index 0> iframe 1 , index 1> iframe 2
		
		
		 
		
		
       // driver.close();
        
       
       
		
		
		
		
		
	}

}

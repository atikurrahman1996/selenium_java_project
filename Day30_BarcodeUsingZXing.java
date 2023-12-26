package webdriverautomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Day30_BarcodeUsingZXing {

	public static void main(String[] args) throws IOException, NotFoundException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
	
	       driver.navigate().to("https://barcode.tec-it.com/en");
			
		   driver.manage().window().maximize();
			
			
			String barcodeURL = driver.findElement(By.xpath("//img[@alt='Barcode']")).getAttribute("src");
			
			System.out.println("The Barcode of the URL is: " + barcodeURL);

			
			URL url = new URL(barcodeURL);
			
			BufferedImage bufferedImage = ImageIO.read(url);
			
			
			LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
			
			Result result = new MultiFormatReader().decode(binaryBitmap);
			
			System.out.println(result.getText());
			
			
			
			
	}

}

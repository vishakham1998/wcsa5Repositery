package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsingExplicitWait {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         
		driver.get("https://www.shoppersstack.com/"); 
		driver.findElement(By.id("electronics")).click();
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("412033");
	 

	 
	}
		
	


}

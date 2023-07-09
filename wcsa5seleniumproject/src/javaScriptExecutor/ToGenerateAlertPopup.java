package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGenerateAlertPopup {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch blue stone
		driver.get("file:///C:/Users/Y-NEW/Desktop/disabledWebElement.html");
		//identify webelement
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		Thread.sleep(2000);
		//To handled disabled webelement
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 //To generate alert popup
		 jse.executeScript("alert('hello There!!');");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 ////To handled disabled webelement
		 jse.executeScript("document.getElementById('i2').value='manager'");
		}
}

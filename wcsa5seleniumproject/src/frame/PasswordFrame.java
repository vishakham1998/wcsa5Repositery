package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordFrame {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	// launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch web application 
	driver.get("file:///C:/Users/Y-NEW/Desktop/loginPage.html");
	driver.findElement(By.id("i1")).sendKeys("djdh");
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).clear();
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='frameId']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("i2")).sendKeys("visks");
	Thread.sleep(2000);
	driver.findElement(By.id("i2")).clear();
	
	}
	
}

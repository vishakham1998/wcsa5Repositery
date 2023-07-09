package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web application 
		driver.get("https://www.google.com/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='backgroundImage']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		WebElement frameElement1 = driver.findElement(By.xpath("//a[@class='gb_d']"));
		frameElement1.click();
		
}
}
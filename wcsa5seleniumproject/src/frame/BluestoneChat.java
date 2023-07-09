package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneChat {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web application 
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		//handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//identify frame by using xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		//handle frame by switch the control to frame
		//handle frame by using frame index
		//driver.switchTo().frame("fc_widget");
		
		driver.switchTo().frame(frameElement);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
//	driver.switchTo().frame(4);
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon]"))).click();
//	
//	
		//switch the control again back to the main web page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("vishakha");
		driver.findElement(By.id("chat-fc-email")).sendKeys("viha@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7057236980");	
		}
}

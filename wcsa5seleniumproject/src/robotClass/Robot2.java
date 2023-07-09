package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Robot2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();//hanadle popup
				//to genrate print popup
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(2000);
			//shift the controls to cancel button
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		
		
		
		
		
	}
}

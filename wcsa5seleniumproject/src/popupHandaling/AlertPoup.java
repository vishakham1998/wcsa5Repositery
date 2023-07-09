package popupHandaling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPoup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Desktop/WorkspaceVishakha/alert.html");
		//to generate pop up by using on buttob
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//handle pop up by using robot class
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		// handale alert pop by using switchTo
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();//for accept the alert popup
		//al.dismiss();// for dismiss the alert pop up
		System.out.println(al.getText());// return the text of alert popup
		
		}
}
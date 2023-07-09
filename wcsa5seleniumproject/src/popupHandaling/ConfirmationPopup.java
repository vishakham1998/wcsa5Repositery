package popupHandaling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Desktop/WorkspaceVishakha/confirmation.html");
		//to genrate confirmation pop up
		driver.findElement(By.tagName("input")).click();
		//to handle confirmation pop up by using switchto ()
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();	
		//al.accept();	//accept 
		//al.dismiss();	//dismiss
		System.out.println(al.getText());
		al.accept();
		al.sendKeys("getText");
		}
}

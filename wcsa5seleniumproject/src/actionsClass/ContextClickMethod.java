package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod
{
	// use to perform Right click
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/SingleSelectDropDown.html");
		WebElement target = driver.findElement(By.id("menu"));
		//to perform right click
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(target).perform();
		
		
		
	}
	
	
}

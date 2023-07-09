package handlingMultipleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("file:///C:/Users/Y-NEW/Documents/SingleSelectDropDown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/SingleSelectDropDown.html");
		
		//identify dropdown on webpage
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown by creating obj of select class
		Select sel = new Select(dropDownElement);
		
		//select the option from dropdown...
		//use selection methods
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		//try to deselect given option from dropdown
		sel.deselectByIndex(2);
	}
		
	
}

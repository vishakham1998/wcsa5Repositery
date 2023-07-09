package handlingMultipleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("file:///C:/Users/Y-NEW/Documents/SingleSelectDropDown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/SingleSelectDropDown.html");
WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown by creating obj of select class
		Select sel = new Select(dropDownElement);
		
		//read all the options of dropdown
		List<WebElement> allOps = sel.getOptions();
		
		//to read list use looping statments
		for(WebElement op:allOps)
		{
			if(op.getText().equals("pav bhaji"))
			{
				Thread.sleep(2000);
				op.click();
				break;
			}
			}
	}
}

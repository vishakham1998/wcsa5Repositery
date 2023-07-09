package handlingMultipleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
	WebElement multiSelectDD = driver.findElement(By.id("menu"));
	Select sel=new Select(multiSelectDD);
	sel.selectByIndex(1);
	Thread.sleep(2000);
	sel.deselectByIndex(1);
	}
}

package handlingMultipleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValue {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
	WebElement multiSelectDD = driver.findElement(By.id("menu"));
	Select sel=new Select(multiSelectDD);
	sel.selectByValue("v5");
	//Thread.sleep(2000);
	//sel.deselectByValue("v5");
	/*Thread.sleep(2000);
	for(int i=0;i<5;i++)
	{
		sel.deselectByIndex(5);
		Thread.sleep(2000);
	}*/
	for(int i=0;i<5;i++)
	{
		sel.deselectByIndex(i);
		Thread.sleep(2000);
	}
	
}
}

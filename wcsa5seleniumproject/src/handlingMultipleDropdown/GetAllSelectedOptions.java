package handlingMultipleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		for(int i=2;i<5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
	List<WebElement> allOpts = sel.getAllSelectedOptions();
	
	/*for(int i=0;i<allOpts.size();i++)
	{
		Thread.sleep(2000);
              System.out.println(allOpts.get(i).getText()); 
	
	}*/
	for(WebElement op:allOpts)
	{
		Thread.sleep(2000);
		System.out.println(op.getText());
	}
}}

package handlingMultipleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		//List<WebElement> dropdownoptions = sel.getOptions();
	/*	for(int i=0;i<dropdownoptions.size();i++)
		{
			String options = dropdownoptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(2000);
		}*/
		List<WebElement> ops = sel.getOptions();
		for(WebElement we:ops)
		{
			String textOfops = we.getText();		
	 System.out.println(textOfops);
	
		}}
}
package AssignmentLogin;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
	HashSet<String> hs = new HashSet<String>();
	List<WebElement> allOpts = sel.getOptions();
	for(int i=0;i<allOpts.size();i++)
	{
		WebElement op = allOpts.get(i);
		String value = op.getText();
		hs.add(value);
	}
	for(String element:hs)
	{
		Thread.sleep(2000);
		System.out.println(element);
	}
}
}
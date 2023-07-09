package handlingMultipleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Y-NEW/Documents/multiSelectDropdown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		WebElement allOpts = sel.getWrappedElement();
		System.out.println(allOpts.getText());
	}
}

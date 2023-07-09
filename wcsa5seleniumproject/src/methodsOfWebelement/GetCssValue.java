package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//System.out.println(driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color"));
		 WebElement  CssProperty= driver.findElement(By.xpath("//button[text()=' Login ']"));
		 String CssValue = CssProperty.getCssValue("color");
		 System.out.println(CssValue);
		
}

}

package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("http://desktop-rkf1bln/login.do");
         WebElement checkBox = driver.findElement(By.name("remember"));
         boolean verify = checkBox.isSelected();
         System.out.println(verify);
         Thread.sleep(2000);
         checkBox.click();
         Thread.sleep(2000);
         checkBox.isSelected();
         //Thread.sleep(2000);
         System.out.println(verify);
	}
	}

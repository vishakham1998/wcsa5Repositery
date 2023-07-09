package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/"); 
	
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("jhkykgdfh");

		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("sfjsfjksf");

		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	
	}
}



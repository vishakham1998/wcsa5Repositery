package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/"); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("jhkykgdfh");

		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("sfjsfjksf");

		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	
	}
}

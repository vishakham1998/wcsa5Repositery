package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mahaganvishakha1998@gmai.com");
		driver.findElement(By.id("pass")).sendKeys("fghfuf");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		
		driver.close();
	}
}

		
		



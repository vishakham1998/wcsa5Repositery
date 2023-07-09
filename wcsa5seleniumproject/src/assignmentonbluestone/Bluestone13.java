package assignmentonbluestone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome/driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Offers '] ")).click();
		//driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).click();
		if(driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("exception");
		}
	}
}

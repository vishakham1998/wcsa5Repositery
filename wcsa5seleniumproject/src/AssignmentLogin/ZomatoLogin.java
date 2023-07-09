package AssignmentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sc-60vv3c-0 eOYJSt sc-fznyAO CWQMf']")).sendKeys("7057236980");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'sc-1kx5g6g-2 fdIbOo')]")).click();
	}
}
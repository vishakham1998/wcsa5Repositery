package AssignmentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.name("userLoginId")).sendKeys("2345678990");
		driver.findElement(By.name("password")).sendKeys("sfsjdk");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}}

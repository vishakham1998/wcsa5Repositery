package AssignmentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
	}
	}

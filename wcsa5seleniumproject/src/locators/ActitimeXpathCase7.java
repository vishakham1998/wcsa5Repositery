package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpathCase7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://desktop-rkf1bln/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='textField'])[1]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='textField'])[2]")).sendKeys("manager");
		Thread.sleep(2000);
		
	}

}

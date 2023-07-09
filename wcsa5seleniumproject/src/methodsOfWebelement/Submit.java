package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("http://desktop-rkf1bln/login.do");
         WebElement loginButton = driver.findElement(By.xpath("//a[@id='loginButton']"));
         loginButton.click();//submit()
         
         driver.navigate().to("http://desktop-rkf1bln/login.do");
         driver.findElement(By.name("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         WebElement loginButton1 = driver.findElement(By.xpath("//a[text()='Login']"));
         loginButton1.click();//submit
	}
         
         
}

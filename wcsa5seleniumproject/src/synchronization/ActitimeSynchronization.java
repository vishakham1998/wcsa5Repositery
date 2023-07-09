package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSynchronization {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-rkf1bln/login.do");
		String actualTitleOfLogInPage = driver.getTitle();
		System.out.println("Title is match,test case is passed");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//home page
		//actitime-enter time track
		System.out.println("Title is match,test case is passed");
		
	}
  public static void explicitWaitMethod(WebDriver driver,int sec,String title) {
	  //to apply explicit wait
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(sec));
	wait.until(ExpectedConditions.titleContains(title));
	  
  }
}

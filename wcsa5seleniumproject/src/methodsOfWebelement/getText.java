package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-rkf1bln/login.do");
	//System.out.println(driver.findElement(By.id("loginButton")).getText());
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//System.out.println(loginButton.getText());
		String elementValue = loginButton.getText();
		System.out.println(elementValue );
	}	
}

package AssignmentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahajanvishakha1998@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("ddued");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(8000);
		driver.close();
         
         
         

	}
}
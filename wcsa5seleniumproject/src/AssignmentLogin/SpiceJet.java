package AssignmentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
				driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2478557242");
						driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dsshsd");
						Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-n6v787 r-1kfrs79 r-q4m81j']")).click();
				Thread.sleep(2000);
		driver.close();
		
	}

}

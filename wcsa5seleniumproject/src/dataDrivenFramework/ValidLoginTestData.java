package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-rkf1bln/login.do");
		//read the data from excel file and test the login page
		Flib flib = new Flib();
		//String validUsername = flib.readexceldata("./data/Actitime.xlsx", "validcreds", 1, 0);
		//String validPassword = flib.readexceldata("./data/Actitime.xlsx", "validcreds", 1, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(flib.readexceldata("./data/Actitime.xlsx", "validcreds", 1, 0));
	
		driver.findElement(By.name("pwd")).sendKeys(flib.readexceldata("./data/Actitime.xlsx", "validcreds", 1, 1));

		driver.findElement(By.tagName("a")).click();
	}
}

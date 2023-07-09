package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestData {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-rkf1bln/login.do");
		//read the data from excel file and test the login page
		Flib flib = new Flib();
		//to read multiple data use for loop
		int rc = flib.getLastRowCount("./data/Actitime.xlsx", "invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		//String invalidUsername = flib.readexceldata("./data/Actitime.xlsx", "invalidcreds", i, 0);
		//String invalidPassword = flib.readexceldata("./data/Actitime.xlsx", "invalidcreds", i, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(flib.readexceldata("./data/Actitime.xlsx", "invalidcreds", i, 0));

		driver.findElement(By.name("pwd")).sendKeys(flib.readexceldata("./data/Actitime.xlsx", "invalidcreds", i, 1));
	
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
	}
}
}

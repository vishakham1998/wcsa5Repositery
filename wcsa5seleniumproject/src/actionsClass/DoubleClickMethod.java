package actionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {
	//use to perform double click

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the actitime30
		driver.get("http://desktop-rkf1bln/login.do");
	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		//perform login operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//home page
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		//click on setting module
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		//click on logo and color
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		//click on use custom logo
		driver.findElement(By.id("uploadNewLogoOption")).click();
		//click on button to select the file
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//perform double click
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(4000);
		
       File file = new File("./autoitPrograms/actitime1.exe");
       String abspath = file.getAbsolutePath();
       Thread.sleep(2000);
       Runtime.getRuntime().exec(abspath);
       Thread.sleep(4000);
        Runtime.getRuntime().exec(abspath);
       
	}
}

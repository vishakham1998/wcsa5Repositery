package javaScriptExecutor;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch blue stone
		driver.get("https://www.selenium.dev/");
		//To perform srolling operations
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 Thread.sleep(2000);
	//SrollDown
	 jse.executeScript("window.scrollBy(0,1000)");
		
}
}
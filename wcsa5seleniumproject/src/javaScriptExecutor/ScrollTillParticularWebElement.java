package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch blue stone
		driver.get("https://www.selenium.dev/");
		//to identify webelement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		//To perform srolling operations for a news element
		////location of newselemnet
		Point loc = newsElement.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		Thread.sleep(2000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 //jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
	 jse.executeScript("arguments[0].scrollIntoView(true)",newsElement);
	
}
}
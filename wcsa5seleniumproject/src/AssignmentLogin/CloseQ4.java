package AssignmentLogin;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQ4 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	// launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch web application 
	driver.get("http://omayo.blogspot.com/");
	
	//get the handle or address of current or parent window
	WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
Point elementLoc = childWindow.getLocation();
int xaxis = elementLoc.getX();
int yaxis = elementLoc.getY();
//scroll till open popup
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	//click on link open child browser
childWindow.click();
//get the adress or handle of parent window
String parentHandle = driver.getWindowHandle();


//get the address or handle of parent window
Set<String> allHandles = driver.getWindowHandles();

//how to close only child browser
for(String wh:allHandles)
{
	if(!parentHandle.equals(wh))
	{
		Thread.sleep(2000);
		driver.switchTo().window(wh).close();
		break;
	}
}

}}


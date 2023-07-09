package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://www.selenium.dev/");
     // System.out.println( driver.findElement(By.xpath("//h2[.='News']")).getLocation());
        Point newElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation();
        int xaxis = newElement.getX();
        int yaxis = newElement.getY();
        System.out.println("xaxis of news webelement:"+xaxis+"yaxis of news webelement:"+yaxis);
	}

}



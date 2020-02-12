package HandlingPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileDownload
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		int yaxis = driver.findElement(By.xpath("//h2[text()='Selenium Client & WebDriver Language Bindings']")).getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,"+yaxis+")");
		
		driver.findElement(By.xpath("//td[text()='Java']/ancestor::tr/descendant::a[text()='Download']")).click();
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	}

}

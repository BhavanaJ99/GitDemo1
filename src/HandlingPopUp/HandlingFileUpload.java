package HandlingPopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFileUpload 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		
		WebElement linkText = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		linkText.click();
		
		String pw = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();
		int count = tabs.size();
		System.out.println(count);
		
		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
			if(pw.equals(tab))
			{
				String pTabTitle = driver.getTitle();
				System.out.println("The parent window is"+pTabTitle);
			}
			else
			{
				String cTabTitle = driver.getTitle();
				System.out.println("The child window is"+cTabTitle);
			}
		}
		
		
		WebElement hcTab = driver.findElement(By.xpath("//a[text()='Help Center']"));
		//hcTab.click();
		Actions act=new Actions(driver);
		act.moveToElement(hcTab).perform();
		
		WebElement csLink = driver.findElement(By.xpath("//a[text()='Contact Support']"));
		csLink.click();
		int yaxis = driver.findElement(By.xpath("//label[text()='Question']")).getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,"+yaxis+")");
		String file ="C:\\Users\\Raghu K\\Desktop\\PROJECT\\front page.docx";
		driver.findElement(By.id("fileupload")).sendKeys(file);
								
	}

}

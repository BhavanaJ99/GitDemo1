package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(1000);
		UN.clear();
		UN.sendKeys("admin");
		
		WebElement PW = driver.findElement(By.xpath("//input[@name='pwd']"));
		Thread.sleep(1000);
		PW.clear();
		PW.sendKeys("manager");
		
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		
	//	WebElement image = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
	//	String image1= image.getTagName();
	//	if(image1.contains("img"))
	//	{
	//		System.out.println("true");
	//	}
	//	else
	//	{
	//		System.out.println("false");
	//	}
	//	
	 //  WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
	//	Thread.sleep(1000);
	//	String lg = logo.getTagName();
	//	if(lg.contains("img"))
	//	{
	//		System.out.println("true");
	//	}
	//	else
	//	{
	//		System.out.println("false");
	//	}
		
		String actualTitle = driver.getTitle();
		Thread.sleep(3000);
		//System.out.println(actualTitle);
		String expectedTitle="actiTIME -  Enter Time-Track";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	
		//driver.findElement(By.xpath("//a[@id='logoutLink']")).click(); 
		}

	}



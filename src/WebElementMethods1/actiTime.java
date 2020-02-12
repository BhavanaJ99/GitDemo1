package WebElementMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime 
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement UN = driver.findElement(By.id("username"));
		UN.clear();
		UN.sendKeys("admin");
		
		WebElement PWD=driver.findElement(By.name("pwd"));
		PWD.clear();
		PWD.sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(1000);
		WebElement image = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		String image1 = image.getTagName();
		if(image1.contains("img"))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is fail");
		}
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		String logo1 = logo.getTagName();
		if(logo1.contains("img"))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is fail");
		}
		String version = driver.findElement(By.xpath("//nobr[text()='actiTIME 2017.4']")).getText();
		System.out.println(version);
		Thread.sleep(1000);
		//driver.findElement(By.id("licenseLink")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.linkText("actiTIME Inc.")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logoutLink")).click();

	}

}

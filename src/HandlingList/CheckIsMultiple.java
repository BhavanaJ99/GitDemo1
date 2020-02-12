package HandlingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIsMultiple 
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Raghu%20K/Desktop/List.html");
		WebElement listBox = driver.findElement(By.id("country"));
		
		Select sel=new Select(listBox);
		System.out.println(sel.isMultiple());
		

	}

}

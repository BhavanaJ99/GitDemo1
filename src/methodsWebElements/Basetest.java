package methodsWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
public static WebDriver driver;
public static void openAPP(String sbrowser)
{
	if(sbrowser.contains("chrome"))
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
	}
	else
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
	}
	
}




}

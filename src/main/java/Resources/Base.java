package Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageObject.Mainpage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	
	WebDriver driver;
	public Mainpage m1;

	
	@BeforeTest
	public WebDriver init()
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\psejal\\gecko\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://google.com/");
		return driver;
		}
	
	@BeforeClass
	public void objectrepo()
	{
		m1=new Mainpage(driver);
	}
}

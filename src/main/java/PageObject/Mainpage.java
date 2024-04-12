package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {

	WebDriver driver;

	public Mainpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="APjFqb")
	WebElement serch;
	
	public void searching(String abc)
	{
		serch.sendKeys(abc);
		serch.submit();
	}
	
	 public void searchpagedisplay()
		{
			int numberOfLinks = driver.findElements(By.tagName("a")).size();
			System.out.println("Number of links on Web Page :" + numberOfLinks);
		}
	 

		@FindBy(xpath = "(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")
		WebElement click;
		
		public void clickonfirstlink() {
			
			click.click();
			driver.getTitle();
			String title = driver.getTitle();
		    System.out.println(title);
		}
		
}

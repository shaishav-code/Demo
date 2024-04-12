package TestCase;

import org.testng.annotations.Test;

import Resources.Base;

public class TC_Mainpage extends Base {
	@Test
	public void task() throws InterruptedException
	{
		m1.searching("What is logger");
		Thread.sleep(1000);
		
		m1.searchpagedisplay();
		Thread.sleep(3000);
		
		m1.clickonfirstlink();
		Thread.sleep(3000);
	}
}

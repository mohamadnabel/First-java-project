package swagLapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCase {
	WebDriver driver = new ChromeDriver();
@BeforeTest
	public void mySetup() throws InterruptedException{
		String myURL ="https://www.saucedemo.com/";
		driver.get(myURL);
		Thread.sleep(2000);

		driver.manage().window().maximize();
	}
@Test
	public void CheckTitele() throws InterruptedException{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
//		mySetup();
		Thread.sleep(2000);

		driver.navigate().back();
	}
@AfterTest
public void afterTesting() throws InterruptedException {
	Thread.sleep(2000);
	driver.manage().window().minimize();

	driver.close();
}
}

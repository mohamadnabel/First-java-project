package swagLapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class localTest {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void Bfourtest() {
		driver.get("http://127.0.0.1:5500/index.html?");
		driver.switchTo().alert().accept();

		driver.manage().window().maximize();

	}

	@Test
	public void LoginTest() throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("/html/body/center/form/input[1]"));
		WebElement password = driver.findElement(By.xpath("/html/body/center/form/input[2]"));
		WebElement button = driver.findElement(By.name("bot"));

		username.sendKeys("mohammad@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("1234564878@Af");
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
//		driver.manage().window().minimize();
		

	}

}

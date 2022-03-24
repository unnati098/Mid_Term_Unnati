package more_ways;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework {
	WebDriver driver = new ChromeDriver();

	@Test
	public void LunchBrowser() throws InterruptedException {
		System.out.println("Lunching the webbrowser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Open Window')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		
	  
  }
}

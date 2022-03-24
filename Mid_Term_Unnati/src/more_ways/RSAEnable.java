package more_ways;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RSAEnable {
	WebDriver driver = new ChromeDriver();

	@Test
	public void LunchBrowser() throws InterruptedException {
		System.out.println("Lunching the webbrowser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			//Assert.assertTrue(true);
		}
		else {
			System.out.println("its disabled");
			//Assert.assertTrue(false);
		}
		Thread.sleep(1000);
		System.out.println();
		System.out.println("After clicking on Round Trip");
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			//Assert.assertTrue(true);
		}
		else {
			System.out.println("its disabled");
			//Assert.assertTrue(false);
		}
	}
}

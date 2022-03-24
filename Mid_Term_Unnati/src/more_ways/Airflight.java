package more_ways;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Airflight {
	WebDriver driver = new ChromeDriver();

	@Test
	public void LunchBrowser() throws InterruptedException {
		System.out.println("Lunching the webbrowser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Ahmedabad (AMD)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("autosugget")).sendKeys("ind");*/
Thread.sleep(2000);
		
		// 1. Dynamic dropdowns
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//For the dynamic dropdowns
		//this is by indexing
		driver.findElement(By.xpath("//a[contains(text(),'Amritsar (ATQ)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Chennai (MAA)')])[2]")).click();
		
		//to get parent child xpath
	
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
		
		// 5.  To select the current date from calendar
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(2000);
		
		
		//6.  Auto selective Dropdowns
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :options)
		{
		if(option.getText().equalsIgnoreCase("India"))
		{
		option.click();
		break;
		}
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
		int i = 1;
		while (i < 8) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// Count the number of checkboxes
		//input[type='checkbox']
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		}
		
		 	}
	



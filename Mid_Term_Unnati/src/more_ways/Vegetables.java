
package more_ways;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vegetables {
	WebDriver driver = new ChromeDriver();

  @Test
  public void f() throws InterruptedException {
	  System.out.println("Lunching the webbrowser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		String[] itemsNeeded = {"Beetroot","Tomato","Brinjal","Almonds","Pista"};
		Thread.sleep(2000);
		
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0; i<products.size(); i++) {
			Thread.sleep(1000);
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			List iteamneededList = Arrays.asList(itemsNeeded);
			System.out.println(formattedname);
			if(iteamneededList.contains(formattedname)) {
				j++;
				Thread.sleep(1000);
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();	
				if(j == itemsNeeded.length) {
					break;
				}
			}
		}
  }
}

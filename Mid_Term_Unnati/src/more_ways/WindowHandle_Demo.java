package more_ways;

import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle_Demo { 
	@Test
public  void fhgf() throws Exception {


System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

// Load the website
driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
String parent=driver.getWindowHandle();

Set<String>s=driver.getWindowHandles();

// Now iterate using Iterator
Iterator<String> I1= s.iterator();

while(I1.hasNext())
{

String child_window=I1.next();
Thread.sleep(2000);

if(!parent.equals(child_window))
{
	Thread.sleep(2000);
driver.switchTo().window(child_window);

System.out.println(driver.switchTo().window(child_window).getTitle());

driver.close();
}

}
Thread.sleep(1000);
//switch to the parent window
driver.switchTo().window(parent);

}
}
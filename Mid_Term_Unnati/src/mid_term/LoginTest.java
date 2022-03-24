package mid_term;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver = new ChromeDriver();
    @BeforeTest
  public void LunchBrowser() {
		System.out.println("Lunching the webbrowser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	}
    @Test  (priority = -1)
    public void Loginwithwrongvalues() {
    	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Unnati");
    	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Unnati123");
    	driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
    	driver.findElement(By.xpath("//input[@id=\"loginButton\"]")).click();
    	try {
			Thread.sleep(1500);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    }
    
    @Test (priority = 0)
    public void Loginwithrightvalue() {
    	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Admin123");
    	driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
    	driver.findElement(By.xpath("//input[@id=\"loginButton\"]")).click();
    	try {
			Thread.sleep(1500);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    }
    @Test (priority = 1)
    public void patient() {
    	driver.findElement(By.xpath("//a[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
    }
    @Test (priority = 2)
    public void enterdata(){
    	  driver.findElement(By.xpath("//input[@name=\"givenName\"]")).sendKeys("Unnati");
		  driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Tarunkumar");
		  driver.findElement(By.xpath("//input[@name=\"familyName\"]")).sendKeys("Patel");
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		 driver.findElement(By.xpath("//select[@id=\"gender-field\"]//option[2]")).click();
		 try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		  driver.findElement(By.xpath("//input[@id=\"birthdateDay-field\"]")).sendKeys("28");
		  driver.findElement(By.xpath("//select[@id=\"birthdateMonth-field\"]//option[@value=\"6\"]")).click();
		  driver.findElement(By.xpath("//input[@id=\"birthdateYear-field\"]")).sendKeys("1990");
		  
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		  driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("3245 hello avenue");
		  driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("Apt.344");
		  driver.findElement(By.xpath("//input[@id=\"cityVillage\"]")).sendKeys("Montreal");
		  driver.findElement(By.xpath("//input[@id=\"stateProvince\"]")).sendKeys("Quebec");
		  driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("Canada");
		  driver.findElement(By.xpath("//input[@id=\"postalCode\"]")).sendKeys("H2S5X5");
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		  driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("+1485-525-4565");
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		  driver.findElement(By.xpath("//select[@id=\"relationship_type\"]//option[@data-val=\"Sibling\"]")).click();
		  driver.findElement(By.xpath("//input[@ng-model=\"relationship.name\"]")).sendKeys("Yash");
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		  driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
		  driver.findElement(By.xpath("//input[@id=\"submit\"]")).click();
		  try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		 
    }
    @Test (priority = 3)
    public void Logout() {
    	driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")).click();
    	 try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
    	 driver.quit();
    	 System.out.println("Logout Successfully!!!");
    }
}

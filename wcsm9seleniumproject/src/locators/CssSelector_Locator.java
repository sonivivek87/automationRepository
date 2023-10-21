package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver(); // launch chrome browser
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(1000);
	
	//identify usernameTb by using cssSelector==>> input[placeholder='Username']
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
	
	Thread.sleep(1000);
	
 // identify passwordTB by using cssSelector==>> input[placeholder='Password']
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	
	Thread.sleep(1000);
	
// identify login button using cssSelector==>button[type='submit']
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	}

}

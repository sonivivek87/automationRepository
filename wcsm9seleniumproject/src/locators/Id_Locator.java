package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	/*get the url of simplelogin of html page we have designed,
    open the page in chrome, copy the url and paste it over here*/
	driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9WebElements/Simplelogin.html");
	
	Thread.sleep(2000);
	
	// identify usernameTB by using id
	driver.findElement(By.id("i1")).sendKeys("admin");
	
	// identify PasswordTB by using id
	Thread.sleep(2000);
	driver.findElement(By.id("i2")).sendKeys("manager");
	}

}

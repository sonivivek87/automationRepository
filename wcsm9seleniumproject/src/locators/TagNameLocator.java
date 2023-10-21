package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	//Launch the self designed web page and pass the value as Admin to Username-textbox
	
	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver(); // launch the chrome browser
    
    driver.manage().window().maximize(); // maximize the browser
    
    Thread.sleep(2000); // provide delay 
    
    /*get the url of simplelogin of html page we have designed,
    open the page in chrome, copy the url and paste it over here*/
    driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9WebElements/Simplelogin.html");
    
    Thread.sleep(3000); // provide delay
    
    // identify UsernameTB and pass input as "admin"
    driver.findElement(By.tagName("input")).sendKeys("Admin");
    
	}
}

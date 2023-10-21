package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator1 {
public static void main(String[] args) throws InterruptedException {
	
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 Thread.sleep(2000);
 
 driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9WebElements/Simplelogin.html");
 Thread.sleep(2000);
 
 // identify usernameTB and pass input as "admin"
 driver.findElement(By.tagName("input")).sendKeys("admin");
 
 //identify passwordTB and pass input as "manager"
 Thread.sleep(2000);
 driver.findElement(By.tagName("input")).sendKeys("manager");
 /* this will not work properly because tagName for both the textbox is same(input).
  * so it will pass both value given by user  to the first suggestion only.
  * and to avoid it we use 'id' as locator to identify/locate the web element
  */
 
}
}

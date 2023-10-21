package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	
/* how to close only child browser?
 ------------------------------------*/
	
	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	 Thread.sleep(2000);
	 
	Set<String> windowhandles = driver.getWindowHandles(); // to get the handles of all the widows those are open in the browser
	Iterator<String> it = windowhandles.iterator(); // Iterator method to iterate through windowhandles
	
    String	parentwindow = it.next();
    System.out.println(parentwindow); //handle/address of parent window
    
    Thread.sleep(2000);
    
    String popupwindow = it.next();
    System.out.println(popupwindow);// handle/address of popup/child window
	
	 
	 driver.switchTo().window(popupwindow);//control shifted to popup window
	 Thread.sleep(2000);
	 driver.close(); 
	}
}


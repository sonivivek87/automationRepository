package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Browsers {
	
	/*	how to close all the browsers/windows without using quit()
	--------------------------------------------------------------*/
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click(); //click on "popup window link"
	
	Set<String> windowhandles = driver.getWindowHandles();//to get all the handles/address of windows which are open
	
	Iterator<String> it = windowhandles.iterator();// Iterator method to iterate through the handles of all the windows 
	String parentwindow = it.next();
	System.out.println(parentwindow);
	Thread.sleep(2000);
	
	String popupwindow = it.next(); 
	System.out.println(popupwindow);
	Thread.sleep(2000);
	
	driver.switchTo().window(popupwindow); //control shifted to popup window by using switchto() method 
	driver.close();
	
	Thread.sleep(2000);
	
	driver.switchTo().window(parentwindow); //control shifted to parent window by using switchto() method 
	driver.close();
	
	}
}

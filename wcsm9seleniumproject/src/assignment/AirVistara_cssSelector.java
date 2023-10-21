package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara_cssSelector {
 public static void main(String[] args) throws InterruptedException {
// to close/to handle the popup notification 
	 
	ChromeOptions co=new ChromeOptions();
	 co.addArguments("--disable-notifications");
	 
	 WebDriver driver=new ChromeDriver(co);
 
 driver.manage().window().maximize();
 driver.get("https://www.airvistara.com/in/en");
 
 Thread.sleep(2000);
 
 // identfy webelemnet to close the extra window
 driver.findElement(By.cssSelector("button[id='cookieModalCloseBtn']")).click();
 
 // identify webElement that is origin
 driver.findElement(By.cssSelector("input[name='flightSearchFrom']")).sendKeys("PNQ"); 
 Thread.sleep(1000);
 
 // identify webElement that is Destination
 driver.findElement(By.cssSelector("input[placeholder='Select Arrival City']")).sendKeys("Delhi");
 Thread.sleep(1000);
 
 // identify webElement that is date
 driver.findElement(By.cssSelector("input[id='departCalendar']")).click();
 Thread.sleep(1000);
 
 driver.findElement(By.cssSelector("a[data-date='22']")).click(); //departure date
 Thread.sleep(2000);
 
 driver.findElement(By.cssSelector("a[data-date='25']")).click(); // return date
 Thread.sleep(1000);
 
 driver.findElement(By.cssSelector("input[id='passengers']")).click(); // passenger
 Thread.sleep(1000);
 
 driver.findElement(By.cssSelector("button[value='business']")).click(); // business
 Thread.sleep(2000);
 
 driver.findElement(By.cssSelector("button[class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();// done
 Thread.sleep(2000);
 
 driver.findElement(By.cssSelector("button[id='book-flight-widget']")).click(); // search flights
 
 
 
 
 
 
 
 
 
}
}

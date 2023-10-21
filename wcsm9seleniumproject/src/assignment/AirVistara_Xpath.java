package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara_Xpath {
public static void main(String[] args) throws InterruptedException {
	
	// to close/to handle the popup notification 
ChromeOptions co=new ChromeOptions();
co.addArguments("--disable-notifications");

WebDriver driver=new ChromeDriver(co);// launch chrome browser 

driver.manage().window().maximize();
driver.get("https://www.airvistara.com/in/en");

Thread.sleep(2000);
//identfy webelemnet to close the extra window
driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("PNQ");//origin
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Delhi");//destination
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id='departCalendar']")).click();// travel dates
Thread.sleep(1000);

driver.findElement(By.xpath("//a[@data-date='22']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//a[@data-date='25']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id='passengers']")).click(); //passengers
Thread.sleep(1000);

driver.findElement(By.xpath("//button[@value='business']")).click(); //Business
Thread.sleep(1000);

driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();// done
Thread.sleep(1000);

driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();// search flights


}
}

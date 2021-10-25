package selenium.day1;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.SeleniumUtils;

public class RailwayReservationActions {

	
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://etrain.info/in");
		driver= util.driver;
		
		System.out.println("The home page"+driver.getCurrentUrl());
		System.out.println("The Page Title"+driver.getTitle());
	// to get current wind id
		String homepage = driver.getWindowHandle();
		System.out.println("Homepage Id : "+homepage);
		WebElement reservationbtn = driver.findElement(By.xpath("//a[text()='Reservation Rules']"));
		reservationbtn.click();
// to get the all windows and tabs ids
		Set<String> allwindId = driver.getWindowHandles();
		System.out.println("all wind ids: "+allwindId);
		Thread.sleep(2000);
// to get child wind id only have to remove 
		allwindId.remove(homepage);
//to check remaining ids
		
		System.out.println("all wind ids: "+allwindId);

//get child window string id from allwinid
		 Iterator<String> itr =allwindId.iterator();
		String chuildwinId = itr.next();
//to move the control on child window		
		driver.switchTo().window(chuildwinId);
		System.out.println("The title of page : "+driver.getTitle());
		WebElement serviceBtn=driver.findElement(By.xpath("//a[text()='Services']"));
		serviceBtn.click();
		//Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

//		WebElement closeBtn = driver.findElement(By.id("corover-close-cb-btn"));
//		closeBtn.click();
		
		
		WebElement mobilesticket = driver.findElement(By.xpath("//div/ul/li/a[text()='Mobile Ticketing Services']"));
		mobilesticket.click();
		
		System.out.println("page url: "+driver.getCurrentUrl());
		
		driver.switchTo().window(homepage);
		
		//System.out.println(driver.findElements(By.tagName("")));
	//	link1.getText();
//		System.out.println("the text of link: "+link1.getText());
	
		driver.findElement(By.id("cbafi1")).sendKeys("pune");
		driver.findElement(By.xpath("//a/I[@class='icon-train-tunneled']")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("cbafi2")).sendKeys("mumbai");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a/I[@class='icon-train-tunneled']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("cbasbmtbtn")).click();

	List<WebElement> exp1 = driver.findElements(By.xpath("//td[@class='pd5 bx3_bgl nobr']"));
	Thread.sleep(2000);
		int expcount = exp1.size();
		for(int i =0; i<expcount; i++) {
			
		System.out.println("the list of express: "+exp1.get(i).getText());
		}
	}

}

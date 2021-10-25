package selenium.day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.SeleniumUtils;

public class NewTabWindow {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws Throwable {

		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://demoqa.com/browser-windows");
		driver = util.driver;
		System.out.println("Home Window: "+driver.getCurrentUrl());		
		
		// to get current window id 
		String homewinId= driver.getWindowHandle();
		System.out.println("Home Window Id"+homewinId);
		
	//click on button to open new tab/window
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		
	// to get the window ids of all the browser window open by webdriver
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All Window Ids: "+allWinIds);
		
	//get child window id 
		Thread.sleep(3000);

		allWinIds.remove(homewinId);
	//all wind id after removing home window id 	
		System.out.println("All Window Ids: "+allWinIds);

	//get child window string id from allwinid
		Iterator<String>itr = allWinIds.iterator();
		String childWinId = itr.next();
		
	//after getting required/child window id switch control to that window

		driver.switchTo().window(childWinId);
		System.out.println("After Opening new tab/ wind current url: "+driver.getCurrentUrl());
	// close child wind in which driver has focus
		Thread.sleep(3000);

	// driver.close();
// once all child page operation done come back to main page
		driver.switchTo().window(homewinId);
		System.out.println("after come back to main page current url: "+driver.getCurrentUrl());

		//driver.close();
// to close all the driver instance 
		
		Thread.sleep(3000);

		driver.quit();
		
	}

}

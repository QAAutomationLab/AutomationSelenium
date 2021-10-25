package selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//System.out.println("the page title is: "+driver.getTitle());
		
		//or
		String pageTitle = driver.getTitle();
		System.out.println("Title is : "+pageTitle);
	
		System.out.println("the page url is: "+driver.getCurrentUrl());
		
		// to gate the source code of the page
		
		//System.out.println("the source code is : "+driver.getPageSource());
	
		// to close the current instance of the class
		
		System.out.println(" the class of page: "+driver.getClass());
		System.out.println("the handler: "+driver.getWindowHandle());
		
	
	
	}

}

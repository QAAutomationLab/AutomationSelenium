package selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		System.out.println("Title of page: "+driver.getTitle());
		System.out.println("The length of title: "+driver.getTitle().length());
		System.out.println("the correct page URL is : "+driver.getCurrentUrl());
		System.out.println("The page source code: "+driver.getPageSource());
		System.out.println("The page length: "+driver.getPageSource().length());
	
	
	
	
	}

}

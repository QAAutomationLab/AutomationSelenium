package selenium.day1;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize window
		driver.manage().window().maximize();
	
		// to set size or minimize
		Thread.sleep(3000);
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(500 , 700));
		
		driver.manage().window().maximize();
		
		//required application URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Webpage title
		System.out.println("page Title"+driver.getTitle());
		
		//Current Page URL
		System.out.println("Current page URL "+driver.getCurrentUrl());
	
		// click on forget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// navigations in brower

		//for back 
		Thread.sleep(2000);
		driver.navigate().back();
		
		//for forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//for refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		// to jump from current page to another page
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
	
		// to close the current instance of the browser
		Thread.sleep(7000);
		driver.close();
	
	
	
	}

}

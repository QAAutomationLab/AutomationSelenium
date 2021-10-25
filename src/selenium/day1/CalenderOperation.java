package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.SeleniumUtils;

public class CalenderOperation {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{

	//SeleniumUtils util = new SeleniumUtils();
//		util.setUp("https://www.makemytrip.com/");
//		driver = util.driver;
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();;
		
	// to open a calender
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);

	// to select date from the calender
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>div:nth-of-type(2)>div:nth-of-type(2)")).click();
		
	}

}

package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumUtils {
	public static Actions action;
	public static WebDriver driver;
	public void setUp(String appUrl) {
		WebDriverManager.chromedriver().setup();
		// creating an object of chromedriver class and upcasting it to WebDriver interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter required application url
		driver.get(appUrl);
		action = new Actions(driver);
	}
	public void performMouseOverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void performRightClickOperation(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}
	public void performDragAndDrop(WebElement source,WebElement target) {
		action.dragAndDrop(source, target).build().perform();
	}
	public void cleanUp() {
		driver.close();
	}
}



	


		
		
	



package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.SeleniumUtils;

public class RedBusCalender {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://www.redbus.in/");
		driver= util.driver;
		
		WebElement frombtn = driver.findElement(By.xpath("//input[@id='src']"));
		frombtn.sendKeys("pune");
		
		WebElement fromallLocationbtn = driver.findElement(By.xpath("//li[@data-id='130']"));
		fromallLocationbtn.click();
		
		WebElement tobtn = driver.findElement(By.xpath("//input[@id='dest']"));
		tobtn.sendKeys("mumbai");
		
		WebElement toallLocationbtn = driver.findElement(By.xpath("//li[@data-id='462']"));
		toallLocationbtn.click();
		
		WebElement datebtn = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		datebtn.click();

		WebElement nextbtn = driver.findElement(By.xpath("//button[text()='>']"));
		nextbtn.click();
		WebElement nextbtn2 = driver.findElement(By.xpath("//button[text()='>']"));
		nextbtn2.click();
		
		WebElement decdate18 = driver.findElement(By.xpath("//tr/td[text()='18']"));
		decdate18.click();

		WebElement searchbtn= driver.findElement(By.xpath("//button[@id='search_btn']"));
		searchbtn.click();
		
		WebElement closebtn = driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']"));
		closebtn.click();
		
//		Actions action = new Actions(driver);
//		action.moveByOffset(0,650);
//		Thread.sleep(3500);
//		action.moveByOffset(0,-450);
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(3500);
		js.executeScript("window.scrollBy(0,-450)", "");

	}

}

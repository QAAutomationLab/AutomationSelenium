package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.SeleniumUtils;

public class JqueryAssignment {

	static WebDriver driver;
	static Actions action;
	
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://jqueryui.com/");
		driver=util.driver;
		action=util.action;
		
		
		WebElement drop=driver.findElement(By.xpath("//a[@href='https://jqueryui.com/droppable/']"));
		drop.click();
		Thread.sleep(2000);

		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Thread.sleep(2000);

		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		
		dragAndDrop(); 
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		
	}


	static void dragAndDrop() throws InterruptedException {
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);

		action.dragAndDrop(source, target).build().perform();	
	}
	
	
}

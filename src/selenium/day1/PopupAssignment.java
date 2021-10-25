package selenium.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.SeleniumUtils;

public class PopupAssignment {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws Throwable {

		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver = util.driver;
		
		handleAlertPopup();
		Thread.sleep(2000);
//		handleConfirmatioPopup();
//		Thread.sleep(2000);
//		handlePromptPopup();
//			
	}


	static void handleAlertPopup() throws Throwable {
		
		WebElement tryframe =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(tryframe);
		
		WebElement tryit =driver.findElement(By.xpath("//body/button[@onclick='myFunction()']"));
		
		Thread.sleep(3500);
		tryit.click();
		String popText = driver.switchTo().alert().getText();
		System.out.println("popup text: "+popText);

		Thread.sleep(3500);
		driver.switchTo().alert().accept();	
		Thread.sleep(3500);

			
			
			
			
		//driver.switchTo().defaultContent();
//			
//		String alrtText = driver.switchTo().alert().getText();
//		System.out.println("the Text: "+alrtText);
//		
//		driver.switchTo().alert().accept();
//		
		
		
	}

}

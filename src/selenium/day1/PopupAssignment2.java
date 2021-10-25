package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.SeleniumUtils;

public class PopupAssignment2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

SeleniumUtils util=new SeleniumUtils();
		
		util.setUp("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver=util.driver;
		
		handlePromptPopup();
		
	}

	static void handlePromptPopup() throws Throwable {

		WebElement frame1 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		
		WebElement trybtn = driver.findElement(By.xpath("//body/button[@onclick='myFunction()']"));
		trybtn.click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Dipak");
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		WebElement demo = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(demo.getText());
		
		
	}

}

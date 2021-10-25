package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.SeleniumUtils;

public class PayTmAssignment {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://paytm.com/");
		driver=util.driver;
		
		clickToSignInButton();
		Thread.sleep(2000);

		getHeader();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='_1tJb1']/a/img")).click();

		
	}

	
	static void clickToSignInButton() {
		WebElement signInBtn=driver.findElement(By.xpath("//div[@class='_1DP5L']"));
		signInBtn.click();
		driver.switchTo().frame(0);
	}
	static void getHeader() {
		WebElement getHeader=driver.findElement(By.xpath("//p[@class='heading']"));
		System.out.println(getHeader.getText());
	}
	
}

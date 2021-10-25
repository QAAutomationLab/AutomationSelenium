package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");

		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
			loginButton.click();
			
			Thread.sleep(2000);
			WebElement logoutLink=driver.findElement(By.id("logoutLink"));
			logoutLink.click();
//			Thread.sleep(2000);
//			driver.close();
//	
	}

}

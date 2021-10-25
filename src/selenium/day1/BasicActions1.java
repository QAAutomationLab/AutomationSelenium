package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		WebElement userNameInputField = driver.findElement(By.name("UserName"));
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField = driver.findElement(By.name("Password"));
		passwordInputField.sendKeys("manager");
		
		//identify login button
		
		WebElement loginButton = driver.findElement(By.cssSelector("input[name=Login]"));
		loginButton.click();
		
	
	}

}

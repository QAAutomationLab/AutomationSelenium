package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		WebElement usernameInputField = driver.findElement(By.name("UserName"));
		WebElement passwordInputField = driver.findElement(By.name("Password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input[name='Login']"));
		
		
		usernameInputField.sendKeys("admin");
		passwordInputField.sendKeys("manager");
		loginButton.click();
		
		List<WebElement> suggList =driver.findElements(By.xpath("//div[@id='cssmenu']/ul/li/a/span"));
		
		
			int suggCount = suggList.size();
		
			System.out.println(suggCount);
			
			for(int i = 0; i<suggCount; i++)
			{
				System.out.println(suggList.get(i).getText());
				
			}
	
	
	}

}

package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		// Enter the required application URL
		driver.get("https://demo.actitime.com/login.do");
		
		// identify the elements / objects in which we want to perform action
		
		//By is predefined class selenium and all its method is static which 
			//are also known as locator. 
/*		selenium supports following locatores
		id, name,linkText,partialLinkText,className,tagName,cssSelector,xPath.
*/	

		//Action: all action prform on WebElement
		/*type---> sendKeys("");
		click ---> click();
		clearing exising value from the field----> clear();
*/	
		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		
		// identify password field
		
		WebElement PasswordInputField = driver.findElement(By.name("pwd"));
		//performing typing operation
		PasswordInputField.sendKeys("manager");
		
		// identify the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//perform click operation
		loginButton.click();
		//close the current browser
		driver.close();
	
	
	}

}

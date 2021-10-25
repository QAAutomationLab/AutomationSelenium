package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActionsEnableDisable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String geturl = driver.getCurrentUrl();
		System.out.println("The Current Page is: "+geturl);
		if(geturl.equals("https://demo.actitime.com/login.do"))
		{
			System.out.println("Ok its right page");
		}
		else {
			System.out.println("Its not correct");
		}
	
		WebElement username= driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
		
		boolean visibilityUsername =username.isDisplayed();
		System.out.println("Visibility of Username is: "+visibilityUsername);
		
		System.out.println("the username is editable : "+username.isEnabled());
		
System.out.println("The placeholder value is: "+username.getAttribute("placeholder"));
		
		/*username.sendKeys("admin");
		password.sendKeys("manager");
		login.click();*/

System.out.println("The login button display status: "+login.isDisplayed());
System.out.println("The login button clickable: "+login.isEnabled());
System.out.println("The login button Name: "+login.getText());

WebElement checkbox = driver.findElement(By.id("keepLoggedInLabel"));

System.out.println("The checkbox display status: "+checkbox.isDisplayed());

checkbox.click();

System.out.println("The checkbox is selected status: "+checkbox.isSelected());

		



		
	}

}

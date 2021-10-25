package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginLogout {

	public static void main(String[] args) throws InterruptedException {

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
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		login.click();
		
		String hompageUrl = driver.getCurrentUrl();
		System.out.println("The HomePage Is:"+hompageUrl);
	if(hompageUrl.equals("https://demo.actitime.com/user/submit_tt.do"));
	{
		System.out.println("yes HomePage is Correct");
	}

	WebElement logout = driver.findElement(By.id("logoutLink"));
	Thread.sleep(2500);
	logout.click();
	
	Thread.sleep(2500);
	String ReturnLoginpage = driver.getCurrentUrl();
	System.out.println("The HomePage Is:"+ReturnLoginpage);
if(ReturnLoginpage.equals("https://demo.actitime.com/login.do"));
{
	System.out.println("yes return to login page is Correct");
}
	

	
	
	
	
	
	
	}

}

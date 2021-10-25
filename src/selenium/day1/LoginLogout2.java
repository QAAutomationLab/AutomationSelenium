package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLogout2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://opensource-demo.orangehrmlive.com/index.php/auth/login")) 
		{
			System.out.println("The Login page is: "+currentUrl);
			System.out.println("Yes its corrent");
		}
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement pass = driver.findElement(By.id("txtPassword"));		
		WebElement login = driver.findElement(By.id("btnLogin"));		
		
		username.sendKeys("admin");
		pass.sendKeys("admin123");
		login.click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement welcomebtn = driver.findElement(By.cssSelector("a[href='#']"));		
		welcomebtn.click();
		
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.cssSelector("a[href='/index.php/auth/logout\']"));
			logout.click();
		
//		Select dropdown = new Select(driver.findElement(By.id("welcome")));	
//		Select logout = new Select(driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")));		
//		logout.selectByIndex(2);
//		
		
		
		
		
	}

}

package selenium.day1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActionsFacebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String facebook = driver.getTitle();
		String currentUrl= driver.getCurrentUrl();
		System.out.println("The Url of page: "+currentUrl);
		System.out.println("The Page title"+facebook);
		
		if(currentUrl.equals("https://www.facebook.com")) {
			System.out.println("yes its correct");
		
	}	else {
		System.out.println("no its not correct");
	}
		WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("db.0215@rediffmail.com");
			
		WebElement Password = driver.findElement(By.id("pass"));	
		Password.sendKeys("sagarlovefb");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();

		Thread.sleep(2000);
		String gettitle = driver.getTitle();
		System.out.println("The current URL is: "+gettitle);
		
		// for logout 
//		WebElement logoutButton = driver.findElement(By.cssSelector("i[data-visualcompletion=\"css-img\"]"));
//		logoutButton.click();		
//		
	}

}
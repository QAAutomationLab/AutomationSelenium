package selenium.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseandKeyboardOperations {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		FileInputStream fs = new FileInputStream("./appData/FormValidations.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String username= prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("pwd");
		System.out.println(password);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		Actions action = new Actions(driver);
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		loginbtn.click();
		
		
		
		
		
		
		
	}

}






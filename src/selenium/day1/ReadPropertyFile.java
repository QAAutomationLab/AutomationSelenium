package selenium.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException, Throwable {

		FileInputStream fis = new FileInputStream("./appData/AppData.properties");
		
		Properties prop = new Properties();
	//load the property file
		prop.load(fis);
		
		//get the data from the property file
		String appUrl = prop.getProperty("url");
		System.out.println(appUrl);
		
		String un = prop.getProperty("username");
		System.out.println(un);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
	//start the browser
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
	//identify all fields and send keys
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
	}

}

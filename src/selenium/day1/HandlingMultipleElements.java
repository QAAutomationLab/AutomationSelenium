package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
   
		// launch the browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	// get the link 
	driver.get("https://www.google.com");
	
	//maximize the window
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement searchInputField=driver.findElement(By.name("q"));
	searchInputField.sendKeys("Selenium Testing");
	
	// to identify the multiple element
	List<WebElement> suggList= driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div[1]/div[2]/div[1]/span"));
	
	//get the count of identify elements
	
	int suggCount = suggList.size();
	System.out.println("The list : "+suggCount);
	
	// to access one by one element
	
	for(int i = 0; i<suggCount; i++)
	{
		System.out.println(suggList.get(i).getText());
		
	}
	
	
		
	}

}

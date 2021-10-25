package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElementAmazone {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		
		List<WebElement> menuBarList = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
				int menuBarCount=menuBarList.size();
				System.out.println(menuBarCount);		
		
				// to access one by one element
				
			for(int i =0; i<menuBarCount; i++)
			{
				if(!menuBarList.get(i).getText().isEmpty()) {
				System.out.println(menuBarList.get(i).getText());
				Thread.sleep(500);
				
				}else {
					System.out.println("Empty "+ i);
					Thread.sleep(500);
					
				}
			}
		
		
	}

}

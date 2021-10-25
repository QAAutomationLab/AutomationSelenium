package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElementGsmarena {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> mobCompanyList = driver.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']/ul/li/a"));
				int mobListCount = mobCompanyList.size();
				System.out.println("The Company List: "+mobListCount);
				for(int i =0; i<mobListCount; i++)
				{
					
					System.out.println("The Brands are: "+mobCompanyList.get(i).getText());
				}
				
				driver.findElement(By.xpath("//a[text()='Samsung']")).click();
				
	List<WebElement> mobNameList = driver.findElements(By.xpath("//div[@class='makers']/ul/li/a/strong/span"));
			int mobNameCount = mobNameList.size();
			System.out.println("No.of Phones: "+mobNameCount);
			for(int i =0; i<mobNameCount; i++)
			{
				Thread.sleep(1000);
				System.out.println("Available Mobiles: "+mobNameList.get(i).getText());
			}
				
		//System.out.println("The Companies are: "+mobCompanyList.getSize()); 
	}

}

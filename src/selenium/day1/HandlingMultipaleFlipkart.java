package selenium.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipaleFlipkart {

	public static void main(String[] args) throws IOException, Throwable {
	// start the browser & maximize the window	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
// create an instance of Inputstream class
		
		FileInputStream fs = new FileInputStream("./appdata/FormValidations.properties");
// create instance of property class
		Properties prop = new Properties();
		prop.load(fs);
		
		String url = prop.getProperty("urlflp");
		System.out.println("the flipkart: "+url);
		driver.get(url);
//ignore login process 		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
//identify the one item from list element 
		
		List<WebElement> categories = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]"));
					int categoriescount = categories.size();
		System.out.println("the list of menus: "+categoriescount);	
		for(int i = 0; i<categoriescount; i++) {
			
			//if(!categories.get(i).getText().isEmpty()) {
			Thread.sleep(1000);

			System.out.println(categories.get(i).getText());
//			}else {
//				
//				System.out.println("Empty"+i);
//				Thread.sleep(1000);
			//}
			
		}
			WebElement categorieslist=driver.findElement(By.xpath("//div[@class='xtXmba']"));
			System.out.println("The Name of menu: "+categorieslist.getText());		
			categorieslist.click();	
			Thread.sleep(2000);
			
		
		
		
//to get the one by one element 
		
		
		
	}

}

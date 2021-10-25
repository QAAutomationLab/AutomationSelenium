package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOPerationsCalculator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.calculator.net/bmi-calculator.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ageInputField = driver.findElement(By.id("cage"));
		WebElement genderBtn 	= driver.findElement(By.id("csex2"));
		ageInputField.clear();
		ageInputField.sendKeys("32");
	
		genderBtn.click();
		
		WebElement height = driver.findElement(By.id("cheightmeter"));
		WebElement weight = driver.findElement(By.id("ckg"));
		
		Thread.sleep(2500);
		height.clear();
		height.sendKeys("161.54");

		Thread.sleep(2500);
		weight.clear();
		weight.sendKeys("60");
		
		WebElement CalculateBtn = driver.findElement(By.cssSelector("input[type='image']"));
		
		Thread.sleep(2500);
		CalculateBtn.click();
		
		
		
		
	}

}

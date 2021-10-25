package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.security.Credential;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		boolean usernameField1 =usernameField.isDisplayed();
		System.out.println(" Username field visible: "+usernameField1);
		
		boolean usernameField2 =usernameField.isEnabled();
		System.out.println(" Username field clickable: "+usernameField2);
		
		String usernameField3 =usernameField.getAttribute("placeholder");
		System.out.println("The placeholder value is: "+usernameField3);
		
		
		
		// identify the element list & get the size
		List<WebElement> credentials = driver.findElements(By.xpath("//div[@id='login_credentials']"));
		int count = credentials.size();
	//	System.out.println("The Credencials size:"+count);
		for(int i=0; i<count; i++) {
			System.out.println(credentials.get(i).getText());
		//String str = (credentials.get(i).getText());
		String str1 ="standard_user,locked_out_user,problem_user,performance_glitch_user" ;		
		String [] s1 = str1.split(",");
			//System.out.println(s1);
		String p1 =s1[0];
		System.out.println(p1);
		//identify element
		usernameField.sendKeys(p1);
		}
		//password field 
		WebElement password = driver.findElement(By.xpath("//div[@class='login_password']"));
		System.out.println(password.getText().toString());
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		boolean passwordField1 =passwordField.isDisplayed();
		System.out.println(" Password field visible: "+passwordField1);
		
		boolean passwordField2 =passwordField.isEnabled();
		System.out.println(" Password  field clickable: "+passwordField2);
		
		String passwordField3 =passwordField.getAttribute("placeholder");
		System.out.println("The placeholder value is: "+passwordField3);
		
		passwordField.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(1000);
		// Selected Element1 & Element2
		WebElement element1= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("Button is Displayed:"+element1.isDisplayed());
		System.out.println("Button is Enabled:"+element1.isEnabled());
		element1.click();
		
		WebElement element2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
		System.out.println("Button2 is Displayed:"+element2.isDisplayed());
		System.out.println("Button2 is Enabled:"+element2.isEnabled());
		element2.click();
		// Cart Button 
		WebElement cartBtn = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		System.out.println("ADD To Cart Button is Displayed:"+cartBtn.isDisplayed());
		System.out.println("ADD To Cart Button is Enabled:"+cartBtn.isEnabled());
		System.out.println("ADD To Cart Button is Enabled:"+cartBtn.isSelected());
		cartBtn.click();
		//Checkout Button
		WebElement checkeoutBtn = driver.findElement(By.xpath("//button[@id='checkout']"));
		System.out.println("Checkeout Button is Displayed:"+checkeoutBtn.isDisplayed());
		System.out.println("Checkout Button is Enabled:"+checkeoutBtn.isEnabled());
		//System.out.println(" Button is Enabled:"+checkeoutBtn.isSelected());
		checkeoutBtn.click();
		//user details form
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		System.out.println("firstName is Displayed:"+firstName.isDisplayed());
		System.out.println("firstName is Enabled:"+firstName.isEnabled());
		System.out.println("The Values in firstname: "+firstName.getAttribute("placeholder"));
		firstName.sendKeys("Dipak");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		System.out.println("lastName is Displayed:"+lastName.isDisplayed());
		System.out.println("lastName is Enabled:"+lastName.isEnabled());
		System.out.println("The Values in lastName: "+lastName.getAttribute("placeholder"));
		lastName.sendKeys("password");
		
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		System.out.println("postalCode is Displayed:"+postalCode.isDisplayed());
		System.out.println("postalCode is Enabled:"+postalCode.isEnabled());
		System.out.println("The Values in postalCode: "+postalCode.getAttribute("placeholder"));
		postalCode.sendKeys("442301");
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		System.out.println("continueBtn is Displayed:"+continueBtn.isDisplayed());
		System.out.println("continueBtn is Enabled:"+continueBtn.isEnabled());
		String continueBtntext =continueBtn.getText();
		System.out.println("The text on button: "+continueBtntext);
		Thread.sleep(1000);

		continueBtn.click();
		//addition of two values
		double value1 =29.99;
		double value2 = 15.99;
		double total = value1+value2;
		
		String totalfinal = String.valueOf(total);
		//String finalvalue =String.valueOf(total);
		
		WebElement totalvalue = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
		String amount = totalvalue.getText();
		//System.out.println("Amount : "+totalvalue.getText());
		double item =45.98;
		
		if(total==item){
			System.out.println("The Total Value is: "+amount);
		}
		else {System.out.println("Wrong");}
		
		WebElement menu =driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout =driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
		

	}

}

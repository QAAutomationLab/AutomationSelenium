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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormValidation {

	public static void main(String[] args) throws IOException, Throwable {
		
		//create the instance of inputStream class	
		
		//create an obj of properties class
		FileInputStream fs = new FileInputStream("./appData/FormValidations.properties");
		Properties pro = new Properties();
		pro.load(fs);

		//starting the browser	
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
   //get the url from the file		
		String apurl = pro.getProperty("url");
		System.out.println(apurl);
		driver.get(apurl);
		
		String firstname = pro.getProperty("firstname");
		System.out.println(firstname);
		WebElement fname=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		System.out.println("FirstName is Displayed: "+fname.isDisplayed());
		System.out.println("FirstName is Enabel: "+fname.isEnabled());
		System.out.println("FirstName values: "+fname.getAttribute("placeholder"));
		fname.sendKeys(firstname);
		
		String lastname = pro.getProperty("lastname");
		System.out.println(lastname);
		WebElement lname = driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		System.out.println("LastName is Displayed: "+lname.isDisplayed());
		System.out.println("LasttName is Enabel: "+lname.isEnabled());
		System.out.println("LasttName values: "+lname.getAttribute("placeholder"));
		lname.sendKeys(lastname);
		
		String add = pro.getProperty("address");
		System.out.println(add);
		WebElement address = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		System.out.println("Address Field Display: "+address.isDisplayed());
		System.out.println("Address Field Enable: "+address.isEnabled());
		address.sendKeys(add);

		String email = pro.getProperty("email");
		System.out.println(email);
		WebElement emailidField = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
		System.out.println("emailidField Field Display: "+emailidField.isDisplayed());
		System.out.println("emailidField Field Enable: "+emailidField.isEnabled());
		emailidField.sendKeys(email);

		String phone = pro.getProperty("phone");
		System.out.println(phone);
		WebElement PhoneField = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
		System.out.println("PhoneField Field Display: "+PhoneField.isDisplayed());
		System.out.println("PhoneField Field Enable: "+PhoneField.isEnabled());
		PhoneField.sendKeys(phone);
		
		WebElement radiobtn = driver.findElement(By.cssSelector("input[value='Male']"));
		System.out.println("RadioButton is Display: "+radiobtn.isDisplayed());
		System.out.println("RadioButton is Selected: "+radiobtn.isSelected());
		radiobtn.click();
		
		  WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		  System.out.println("checkbox1 is Display: "+checkbox1.isDisplayed());
   		  System.out.println("checkbox1 is Selected: "+checkbox1.isSelected());
		  checkbox1.click();
		  
		  WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		  System.out.println("checkbox2 is Display: "+checkbox2.isDisplayed());
   		  System.out.println("checkbox2 is Selected: "+checkbox2.isSelected());
		  checkbox2.click();
		 
		  WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		  System.out.println("checkbox3 is Display: "+checkbox3.isDisplayed());
   		  System.out.println("checkbox3 is Selected: "+checkbox3.isSelected());
		  checkbox3.click();
		  
	//identify dropdown 
		  
	WebElement langdropdown = driver.findElement(By.id("msdd"));
	langdropdown.click();
	//Select sc = new Select(langdropdown);
// to print options on console	
	/*List<WebElement>options=sc.getOptions();
	System.out.println("options are : "+options.size());
	for(int i = 0; i<options.size(); i++) {
		System.out.println(options.get(i).getText());
	}
*/
//for first selected option 
	//String selectedoption = sc.getFirstSelectedOption().getText();
	//System.out.println(selectedoption);
	//System.out.println(sc.getFirstSelectedOption().getText());
//select any option form dropdown	
		//sc.selectByIndex(7);

// for select skills multiselect 	
	WebElement skillFieldDropDown= driver.findElement(By.xpath("//select[@id='Skills']"));
	System.out.println("skillFieldDropDown is Dispaly :"+skillFieldDropDown.isDisplayed());
	System.out.println("skillFieldDropDown is Editable: "+skillFieldDropDown.isEnabled());
	System.out.println("skillFieldDropDown is selected: "+skillFieldDropDown.isSelected());

	Select s1= new Select(skillFieldDropDown);	
	System.out.println("List is Multiselect: "+s1.isMultiple());
	  
	List<WebElement> ListCount = s1.getOptions();
	System.out.println("the list is : "+ListCount.size());
	for(int i =0; i<ListCount.size(); i++)
	{
		System.out.println(ListCount.get(i).getText());
	}
	  
	String selectedOption = s1.getFirstSelectedOption().getText();
	System.out.println("First Value: "+selectedOption);
	s1.selectByIndex(4);
	System.out.println("Skill Selected: "+s1.getFirstSelectedOption().getText());

// countries DropDown Menu
	WebElement contryDropDown1= driver.findElement(By.xpath("//div/select[@id='countries']"));
	boolean check2 = contryDropDown1.isDisplayed();
	System.out.println("contry id display: "+check2);
	System.out.println("contry field is editable: "+contryDropDown1.isEnabled());
	contryDropDown1.click();
//Country DropDown Menu	
	WebElement contryFieldDropDown= driver.findElement(By.xpath("//select[@id='country']"));
	System.out.println("contryFieldDropDown is Dispaly :"+contryFieldDropDown.isDisplayed());
	System.out.println("contryFieldDropDown is Editable: "+contryFieldDropDown.isEnabled());
	System.out.println("contryFieldDropDown is selected: "+contryFieldDropDown.isSelected());
	Select s2= new Select(contryFieldDropDown);	
	s2.selectByIndex(3);
	System.out.println("Contry: "+s2.getFirstSelectedOption().getText());

//year DropDown menu	
	WebElement yearDropDown= driver.findElement(By.xpath("//select[@id='yearbox']"));
	System.out.println("yearDropDown is Dispaly :"+yearDropDown.isDisplayed());
	System.out.println("yearDropDown is Editable: "+yearDropDown.isEnabled());
	System.out.println("yearDropDown is selected: "+yearDropDown.isSelected());
	Select s3= new Select(yearDropDown);	
	s3.selectByIndex(2);
	System.out.println("year: "+s3.getFirstSelectedOption().getText());

//Month DropDown menu	
	WebElement monthDropDown= driver.findElement(By.xpath("//select[@placeholder='Month']"));
	System.out.println("monthDropDown is Dispaly :"+monthDropDown.isDisplayed());
	System.out.println("monthDropDown is Editable: "+monthDropDown.isEnabled());
	System.out.println("monthDropDown is selected: "+monthDropDown.isSelected());
	Select s4= new Select(monthDropDown);	
	s4.selectByIndex(3);
	System.out.println("Month: "+s4.getFirstSelectedOption().getText());

//day DropDown menu 	
	WebElement DayDropDown= driver.findElement(By.xpath("//select[@id='daybox']"));
	System.out.println("DayDropDown is Dispaly :"+DayDropDown.isDisplayed());
	System.out.println("DayDropDown is Editable: "+DayDropDown.isEnabled());
	System.out.println("DayDropDown is selected: "+DayDropDown.isSelected());
	Select s5= new Select(DayDropDown);	
	s5.selectByIndex(1);
	System.out.println("Day: "+s5.getFirstSelectedOption().getText());

//first password field	
	String pass = pro.getProperty("pass");
	System.out.println(pass);
	WebElement pass1 = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	System.out.println("1st Password is Dispaly :"+pass1.isDisplayed());
	System.out.println("1st Password is Editable: "+pass1.isEnabled());
	pass1.sendKeys(pass);;
	
//confirm password field	
	String copass = pro.getProperty("copass");
	System.out.println(copass);
	WebElement copass1 =driver.findElement(By.xpath("//input[@id='secondpassword']"));
	System.out.println("2nd Password is Dispaly :"+copass1.isDisplayed());
	System.out.println("2nd Password is Editable: "+copass1.isEnabled());
	copass1.sendKeys(copass);;	
//submit button	
	WebElement submitbtn = driver.findElement(By.id("submitbtn"));
	System.out.println("submit button is Dispaly :"+copass1.isDisplayed());
	System.out.println("submit button is Editable: "+copass1.isEnabled());
	System.out.println("The text on button: "+submitbtn.getText());
	
	Actions action  = new Actions(driver);
	WebElement facebook = driver.findElement(By.xpath("//a[@class='link facebook']"));
	Thread.sleep(3000);
	action.moveToElement(facebook).perform();
	System.out.println("move the cursor to facebook menu");
	
	WebElement twitter = driver.findElement(By.xpath("//a[@class='link twitter']"));
	Thread.sleep(3000);
	action.moveToElement(twitter).perform();
	
	WebElement linkdin = driver.findElement(By.xpath("//a[@class='link linkedin']"));
	Thread.sleep(3000);
	action.moveToElement(linkdin).perform();
	

	WebElement gplus = driver.findElement(By.xpath("//a[@class='link google-plus']"));
	Thread.sleep(3000);
	action.moveToElement(gplus).perform();
	
	
	
	
	//submitbtn.click();
	
	
		
	}

}

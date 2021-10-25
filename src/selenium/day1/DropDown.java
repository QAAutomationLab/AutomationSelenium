package selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String []args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement firstname= driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		System.out.println("firstname is Dispaly :"+firstname.isDisplayed());
		System.out.println("firstname is Editable: "+firstname.isEnabled());
		System.out.println("firstname place holder value is: "+firstname.getAttribute("placeholder"));
		firstname.sendKeys("Dipak");
		
		WebElement lastName = driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		System.out.println("LastName is Dispaly :"+lastName.isDisplayed());
		System.out.println("LastName is Editable: "+lastName.isEnabled());
		System.out.println("Lastname place holder value is: "+lastName.getAttribute("placeholder"));
		lastName.sendKeys("Balapure");
		
		WebElement addressField = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		System.out.println("Address is Dispaly :"+addressField.isDisplayed());
		System.out.println("Address is Editable: "+addressField.isEnabled());
		addressField.sendKeys("Gandhi Ward,Hinganghat,Wardha,Maharashtra");
		
		WebElement emailIdField = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
		System.out.println("Email Id is Dispaly :"+emailIdField.isDisplayed());
		System.out.println("Email Id is Editable: "+emailIdField.isEnabled());
		emailIdField.sendKeys("sagar123bala@gmail.com");
		
		WebElement phoneField = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
		System.out.println("Phone No field is Dispaly :"+phoneField.isDisplayed());
		System.out.println("Phone No field is Editable: "+phoneField.isEnabled());
		phoneField.sendKeys("8668620456");
		
		
		WebElement radioBtnMale = driver.findElement(By.cssSelector("input[value='Male']"));
		System.out.println("radio button is Dispaly :"+radioBtnMale.isDisplayed());
		System.out.println("radio button is selected: "+radioBtnMale.isSelected());
			radioBtnMale.click();
		System.out.println("radio button is selected: "+radioBtnMale.isSelected());

		  driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		  driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		  driver.findElement(By.xpath("//input[@id='checkbox3']")).click();

		WebElement languageOption= driver.findElement(By.id("msdd"));
		languageOption.click();
	
		WebElement skillFieldDropDown= driver.findElement(By.xpath("//select[@id='Skills']"));
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
		s1.selectByIndex(2);
		System.out.println("Skill Selected: "+s1.getFirstSelectedOption().getText());
		
		WebElement contryDropDown1= driver.findElement(By.xpath("//select[@id='Skills']"));
					boolean display1 = contryDropDown1.isDisplayed();
					System.out.println("contry id display: "+display1);
					boolean check1 = contryDropDown1.isSelected();
					System.out.println("contry is selected: "+check1);
					System.out.println("contry field is editable: "+contryDropDown1.isEnabled());
		
		WebElement contryDropDown2= driver.findElement(By.xpath("//div/select[@id='countries']"));
		boolean check2 = contryDropDown2.isDisplayed();
		System.out.println("contry id display: "+check2);
		System.out.println("contry field is editable: "+contryDropDown2.isEnabled());

		WebElement contryFieldDropDown= driver.findElement(By.xpath("//select[@id='country']"));
		Select s2= new Select(contryFieldDropDown);	
		s2.selectByIndex(3);
		System.out.println("Contry: "+s2.getFirstSelectedOption().getText());
		
		WebElement yearDropDown= driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s3= new Select(yearDropDown);	
		s3.selectByIndex(2);
		System.out.println("year: "+s3.getFirstSelectedOption().getText());
		
		WebElement monthDropDown= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4= new Select(monthDropDown);	
		s4.selectByIndex(3);
		System.out.println("Month: "+s4.getFirstSelectedOption().getText());
		
		
		WebElement DayDropDown= driver.findElement(By.xpath("//select[@id='daybox']"));
		Select s5= new Select(DayDropDown);	
		s5.selectByIndex(1);
		System.out.println("Day: "+s5.getFirstSelectedOption().getText());
	
		WebElement passwordNew= driver.findElement(By.xpath("//input[@id='firstpassword']"));
		System.out.println("1St Password is Dispaly :"+passwordNew.isDisplayed());
		System.out.println("1St Password is Editable: "+passwordNew.isEnabled());
		passwordNew.sendKeys("Sagar@123");
		
		WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='secondpassword']"));
		System.out.println("Confirm Password is Dispaly :"+confirmPassword.isDisplayed());
		System.out.println("Confirm Password is Editable: "+confirmPassword.isEnabled());
		confirmPassword.sendKeys("Sagar@123");

		
		
		
		
	}

}

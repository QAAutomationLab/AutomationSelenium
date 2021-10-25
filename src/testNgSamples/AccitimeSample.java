package testNgSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.SeleniumUtils;

public class AccitimeSample extends SeleniumUtils{
  static WebDriver driver;
  @Test
  public void a_OpenBrowserAndAppURL() throws InterruptedException {
	  setUp("https://demo.actitime.com/login.do");
	  driver= SeleniumUtils.driver;
	  
	  
  }
  
  @Test
  public void b_Login() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  
  }
  @Test
  public void d_Logout() throws InterruptedException {
	  Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	  
  }
  
  
  
  
  
  
  
}

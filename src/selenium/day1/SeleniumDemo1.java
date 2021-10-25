package selenium.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class SeleniumDemo1 {

	public static void main(String[] args) {
		

//		launchRequiredBrowser("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\SeleniumBasics\\\\drivers\\\\IEDriverServer.exe\"");
//		launchRequiredBrowser("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		launchRequiredBrowser("Internet Explorer");
		launchRequiredBrowser("chrome");
		launchRequiredBrowser("mozila");
	}

	static void launchRequiredBrowser(String browerserName)
	{
		
		if(browerserName.equalsIgnoreCase("Internet Explorer")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\IEDriverServer.exe");
			InternetExplorerDriver  idrive = new InternetExplorerDriver();

		}
		else if(browerserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
			ChromeDriver chr = new ChromeDriver();

			
		}else if(browerserName.equalsIgnoreCase("mozila")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\geckodriver.exe");
			FirefoxDriver fdx = new FirefoxDriver();
		}
		
	}
	
}

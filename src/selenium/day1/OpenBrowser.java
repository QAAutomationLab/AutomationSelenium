package selenium.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		// for launch chrome 
		
/*		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		ChromeDriver chr = new ChromeDriver();
*/		
		
		 //for launch firefox
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumBasics\\drivers\\geckodriver.exe");
//		
//		FirefoxDriver fdx = new FirefoxDriver();
	
		//for launch Internet Explorer
System.setProperty("webdriver.ie.driver","./SeleniumBasics/drivers/IEDriverServer.exe");
		
		InternetExplorerDriver  idrive = new InternetExplorerDriver();
	
	
	
	}

}

package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Visit_using_webdrivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Webdrivermanager set up for chrome browser
		 
		WebDriverManager.chromedriver().setup();
				
		// Webdriver object set for chrome browser
				
		WebDriver driver=new ChromeDriver();
				
		// url visit 
		driver.get("https://www.tutorialspoint.com/");
	}

}

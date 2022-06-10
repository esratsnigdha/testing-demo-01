package QAmonCodeTestByEsrat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Visit_using_webdrivermanager {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub


		// Webdrivermanager set up for chrome browser
		 
		WebDriverManager.chromedriver().setup();
				
		// Webdriver object set for chrome browser
				
		WebDriver driver=new ChromeDriver();
				
		// url visit 
		driver.get("https://www.demoblaze.com/index.html");
		
		//1 Current URL Capture
		System.out.println("Current URL is:"+driver.getCurrentUrl());
		
		//2 Page Title Capture
		System.out.println("Page Title is"+driver.getTitle());
		
		//3 Navigate to another URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//Delay for 5 sec
		Thread.sleep(5000);
		
		//Refresh the page
		driver.navigate().refresh();
		
		// Open New Tab
		driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.aftercareexplained.com/");
		
		// Seconed New Tab
		driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.chhoto.link/");
		
		//Close Browser
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}
	

}

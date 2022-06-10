package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Operation_Of_a_web_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Webdrivermanager set up for chrome browser
		 
				WebDriverManager.chromedriver().setup();
						
				// Webdriver object set for chrome browser
						
				WebDriver driver=new ChromeDriver();
						
				// url visit 
				driver.get("https://www.tutorialspoint.com/");
				//1. Page Title Capture
				System.out.println("Page Title is: "+driver.getTitle());
				
				//2. Current URL Capture
				System.out.println("Current URL is:"+driver.getCurrentUrl());
				
				//3. Server end/ page source capture
				System.out.println("Page Source Code is:"+driver.getPageSource());
				
				//7.Delay for 5 sec
				Thread.sleep(5000);
				
				//4. Maximize the window
				driver.manage().window().maximize();
				
				//7.Delay for 3 sec
				
				Thread.sleep(3000);

				
				//5. Full Screen the window
				driver.manage().window().fullscreen();
				
				//7.Delay for 3 sec
				Thread.sleep(3000);

				
				//6. Minimize the window
				driver.manage().window().minimize();

	}

}

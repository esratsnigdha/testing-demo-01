package QAmonCodeTestByEsrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		// Webdrivermanager set up for chrome browser
		 
		WebDriverManager.chromedriver().setup();
				
		// Webdriver object set for chrome browser
				
		WebDriver driver=new ChromeDriver();
				
		// url visit 
		driver.get("https://www.nexchar.com/signup");
		
		// Id: Register 
		
		//with webelement Object
		WebElement username = driver.findElement(By.id("Email"));
		
		//click
		Thread.sleep(2000);
		username.click();
		
	}
	
}

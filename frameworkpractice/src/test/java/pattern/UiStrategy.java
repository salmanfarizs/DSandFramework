package pattern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.UILogin;

public class UiStrategy implements Capability {
	
	public static RemoteWebDriver driver;
	UILogin uilogin = UILogin.getInstance();

	public void login() {
		
			
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(driver.getSessionId());
			
			EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
			MyListener  listener = new MyListener();
			eventDriver.register(listener);
			
			
			eventDriver.manage().window().maximize();
			
			eventDriver.get("https://www.youtube.com/");
			eventDriver.get("https://www.google.com/");
			
			
			
			
				
			
		
				
			
	}
			
			



	@Override
	public void getCurrentWindow() {
		// TODO Auto-generated method stub
		uilogin.getCurrentUrl();
		
	}
	
}

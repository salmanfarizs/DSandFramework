package stepdefs;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;



public class UiStepDef {

	
	
	public static WebDriver driver;
	
	
	@Given("Go to url \"([^\"]*)\"$")
	public void goToUrl(String website) {
		System. setProperty("webdriver.chrome.driver", "F:\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");
		// Initialize browser.
		 driver=new ChromeDriver();
		 driver.get(website);
		 System.out.println("running");
		
	}
	
	
}

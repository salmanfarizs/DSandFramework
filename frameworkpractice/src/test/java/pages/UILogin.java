package pages;

import org.openqa.selenium.WebDriver;

import pattern.UiStrategy;

public class UILogin  {
	
	
 
	private static UILogin instance;
	 
	  private UILogin()
	  {
	    // private constructor
	  }
	 
	  public static UILogin getInstance()
	  {
	    if (instance == null)
	    {
	      //synchronized block to remove overhead
	      synchronized (UILogin.class)
	      {
	        if(instance==null)
	        {
	          
	          instance = new UILogin();
	        }
	       
	      }
	    }
	    return instance;
	  }
	
	
	public void getCurrentUrl() {
		
		System.out.println(UiStrategy.driver.getCurrentUrl() + "url");
		
	}

}

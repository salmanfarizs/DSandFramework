package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pattern.Capability;
import pattern.CapabilityFactory;
import pattern.Channel;
import pattern.ChannelFactory;


public class CommonStepDef {

	Channel channeltype;
	
	
	@Given("Set channel \"([^\"]*)\"$")
	public void setChannel(String channel){
		
		
		 channeltype = new ChannelFactory().getChannel(channel);
		
		Capability cap = new CapabilityFactory().getStrategy(channel);
		
		channeltype.setCapCapability(cap);
		
		
	}
	
	@Then("Login into Application")
	public void login() {
		
		
		channeltype.login();
		channeltype.getCurrentWindow();
		
		
	}
}

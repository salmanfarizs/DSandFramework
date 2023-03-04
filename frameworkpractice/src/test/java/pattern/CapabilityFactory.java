package pattern;

public class CapabilityFactory {
	
	
	
	public Capability getStrategy(String channeltype) {
		
		
		switch(channeltype) {
		
		case "API":
		return new ApiStrategy();
		case "UI":
		return new UiStrategy();
		}
		return null;
	}

}

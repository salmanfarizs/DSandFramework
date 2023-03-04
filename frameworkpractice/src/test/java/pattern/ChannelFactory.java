package pattern;

public class ChannelFactory {
	
	
	
	public Channel getChannel(String channelType) {
		
		switch(channelType) {
		
		case "API":
		return new Api();
		case "UI":
		return new Ui();
		}
		return null;
		
	}

}

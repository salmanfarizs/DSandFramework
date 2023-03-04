package pattern;

import lombok.Data;

@Data
public abstract class Channel {
	
	Capability cap;
	
	public Capability setCapCapability(Capability cap) {
		return this.cap=cap;
	}
	
	public void login() {
		cap.login();
	}
	
	public void getCurrentWindow() {
		cap.getCurrentWindow();
	}

}

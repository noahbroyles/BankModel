package bank;

public class Online extends Bank {
	
	private String URL;
	
	public String toString() {
		return super.toString() + "URL: " + URL;
	}

	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @param uRL the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}
	
	

}

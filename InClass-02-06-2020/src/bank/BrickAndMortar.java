package bank;

public class BrickAndMortar extends Bank {
	
	private String address;
	
	
	public String toString() {
		return super.toString() + "; Address: " + address;
	}
	

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	

}

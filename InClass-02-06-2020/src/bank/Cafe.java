package bank;

import java.net.URI;

public class Cafe extends Bank {
	
	private String menu;
	
	public String toString() {
		return super.toString() + " Menu: " + menu;
	}
	

	/**
	 * @return the menu
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}

}

package bank;


/***
 * Models a bank corporation like 5/3
 * @author broylend
 *
 */
public class Bank {

	private String companyName;
	
	
	public String toString() {
		return "Bank Name: " + companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}

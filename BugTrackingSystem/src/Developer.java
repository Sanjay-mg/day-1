
public class Developer {
	private int developerID;
	private String developerName;
	private String developerEmail;
	
	public Developer(String name) {
		setDeveloperName(name);
	}
	public int getDeveloperID() {
		return developerID;
	}
	public void setDeveloperID(int developerID) {
		this.developerID = developerID;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getDeveloperEmail() {
		return developerEmail;
	}
	public void setDeveloperEmail(String developerEmail) {
		this.developerEmail = developerEmail;
	}
	
	
}

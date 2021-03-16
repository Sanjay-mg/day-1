
public class Tester {
	private int testerID;
	private String testerName;
	private String testerEmail;
	
	public Tester(String name) {
		setTesterName(name);
	}
	public int getTesterID() {
		return testerID;
	}
	public void setTesterID(int testerID) {
		this.testerID = testerID;
	}
	public String getTesterName() {
		return testerName;
	}
	public void setTesterName(String testerName) {
		this.testerName = testerName;
	}
	public String getTesterEmail() {
		return testerEmail;
	}
	public void setTesterEmail(String testerEmail) {
		this.testerEmail = testerEmail;
	}
	
}


public class Customer {
	private String name;
	private int phoneNumber;
	
	public Customer(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

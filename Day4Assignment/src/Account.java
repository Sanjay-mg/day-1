
public class Account {
	private String name;
	private float balance;
	public Account(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "{Account Name is: "+this.name+" and Balance is: "+this.balance+" }";
	}
}

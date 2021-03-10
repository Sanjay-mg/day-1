
public class Application {
	public static void main(String[] args) {
		Customer c1 = new Customer("person");
		Order od1 = new Order(1);
		Address ad1 = new Address("xyz","abc","ijk",23145);
		c1.setPhoneNumber(123456789);
		od1.setItem("phone");
		od1.setStatus(STATUS.ORDERED);
	}
}


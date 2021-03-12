import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Account[] accountsArray = new Account[10];
		List<Account> accountsList = new ArrayList<Account>();
		for (int i = 0; i < accountsArray.length; i++) {
			Account account = new Account("account"+i);
			account.setBalance(1000*i);
			accountsArray[i] = account;
		}
		for (Account account : accountsArray) {
			System.out.println(account);
		}
		for (int i = 0; i < accountsArray.length; i++) {
			Account account = new Account(accountsArray[i].getName());
			account.setBalance(accountsArray[i].getBalance());
			accountsList.add(account);
		}
		System.out.println(accountsList);
	}
}

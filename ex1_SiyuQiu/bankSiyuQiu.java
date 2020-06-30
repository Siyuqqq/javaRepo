public class Account {
	int account_number;
    int balance;
    String customer_name;
    String email;
    String phone_number;
	public void Account(int account_number, int balance, String customer_name, String email, String phone_number) {
		this.account_number = account_number;
		this.balance = balance;
		this.customer_name = customer_name;
		this.email = email;
		this.phone_number = phone_number;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("Customer name : " + customer_name);
		System.out.println("Balance : " + Integer.toString(balance));
	}
	public void withdrawal(int amount) {
		if (balance < amount) {
			System.out.println("Customer name : " + customer_name);
			System.out.println("Failed to withdrawl : insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Customer name : " + customer_name);
			System.out.println("Balance : " + Integer.toString(balance));
		}
	}
	public void getInfo(){
			System.out.println("Customer name : " + customer_name);
			System.out.println("Account Number : " + account_number);
			System.out.println("Balance : " + Integer.toString(balance));
			System.out.println("Email : " + email);
			System.out.println("Phone Number : " + phone_number);
	}
	
}

public 
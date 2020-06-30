public class Main {

	public static void main(String[] args) {
		Account Siyu = new Account();
		Siyu.start(123456789, 50, "Siyu Qiu", "siyuqqq@gmail.com", "6464014642");
		Siyu.deposit(1000);
		Siyu.withdrawal(2000);
		Siyu.withdrawal(500);
		Siyu.getInfo();
	}
}
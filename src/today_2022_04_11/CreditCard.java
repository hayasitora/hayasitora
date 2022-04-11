package today_2022_04_11;

public class CreditCard {
static long number;
static String owner;
static int balance;
static int point;
	static void use() {
		int use=0;
		balance=balance+use;
	}
	static void paybill(int amount) {
		balance= balance - amount;
		addPoint(amount);
	}
	static void addPoint(int amount) {
		point= point +amount/1000;
	}
}

package day06;

/**
 * 
 * @author student
 * @since 2019.04.30
 * @version 1.0
 */
public class Account {
	// 동사는 기능으로
	private String number;
	private int money;

	public Account() {
		this("000", 0);//첫줄에서만 허용
		// this.setNumber("000");
		// this.setMoney(0);
	}

	public Account(String number, int money) {
		this.setNumber(number);
		this.setMoney(money);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money >= 0)
			this.money = money;
	}

	public void input(int money) {
		if (money > 0)
			this.money += money;
	}

	public int output(int money) {
		if (this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족!!");
		return 0;

	}

	/**
	 * 
	 * @param from  입금통장
	 * @param to    출금통장
	 * @param money 이체금액
	 */

	// 계좌이체
	public static void transfer(Account from, Account to, int money) {// static 가능, heap자원,this 안씀.
		to.input(from.output(money));
	}

	// 통장정보출력
	public void print() {
		System.out.printf("Account[통장번호:%20s, 잔고:%d원]%n", number, money);
	}

}

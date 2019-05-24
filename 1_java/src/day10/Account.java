package day10;

import java.io.Serializable;

/**
 * 
 * @author student
 * @since 2019.05.08
 * @version 1.0
 */
public class Account extends Object implements Serializable {
	// 동사는 기능으로
	private String number;
	private int money;

	public Account() {
		//this("000", 0);

	}

	public Account(String number, int money) throws MoneyException { //클라이언트에게 보낼때
		this.setNumber(number);
		//try {//운영자가 받을때
			this.setMoney(money);
		//} catch (MoneyException e) {
		//	System.out.println(e.getMessage());

		//}

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

	public void setMoney(int money) throws MoneyException {
		if (money < 0)
			throw new MoneyException();
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

	// 계좌이체
	public static void transfer(Account from, Account to, int money) {// static 가능, heap자원,this 안씀.
		to.input(from.output(money));
	}

	// 통장정보출력
	public void print() {
		System.out.printf("Account[통장번호:%20s, 잔고:%d원]%n", number, money);
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}

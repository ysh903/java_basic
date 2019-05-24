package day07;

public class Test02_Singlton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);

	}

}

class Singleton {
	static Singleton s = new Singleton();

	private Singleton() {// 외부 객체 생성 불가
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}

}
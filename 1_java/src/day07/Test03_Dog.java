package day07;

public class Test03_Dog {

	public static void main(String[] args) {
		// 업 캐스팅
		Dog d = new Dog("시베리안허스키", "케리");
		d.print();
		System.out.println(d.kind);
		System.out.println(((Animal) d).kind);
		// 다운캐스팅
		Object a = new Dog("시베리안허스키", "캐리");
		System.out.println(((Animal) a).kind);
		System.out.println(((Dog) a).kind);
		System.out.println("-------------");
		if (a instanceof Animal)
			System.out.println(((Animal) a).kind);
		System.out.println("-------------");

		if (a instanceof Dog)
			System.out.println(((Dog) a).kind);
		System.out.println("-------------");

		if (a instanceof String)
			System.out.println(((String) a).toString());

	}

}

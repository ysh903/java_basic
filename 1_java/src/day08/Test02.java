package day08;

public class Test02 {

	public static void main(String[] args) {

		//Animal a = new Animal();//객체 선언 에러
		//Animal[] animals = new Animal[3];//타입 선언 가능
		Animal[] animals = {
				new Fish("쿠퍼"),
				new Dog("시베리안허스키","캐리")
		};
		
		for (Animal a:animals) {
			exec(a);
		}

	}
	
	public static void exec(Animal f) {
		f.breath();
		f.print();
	}

}

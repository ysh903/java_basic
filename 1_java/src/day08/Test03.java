package day08;

import prob07.Person;
import prob07.Student;

public class Test03 {

	public static void main(String[] args) {
		Object[] obj = {
				new Fish("쿠퍼"),
				new Dog("시베리안허스키","캐리"),
				"hello java",
				new Student("000",22,2)
		};
		for (Object data:obj) {
		exec(data);
		}
	}
	
	
	
	public static void exec(Object obj) {
		if(obj instanceof Person)
		((Person) obj).print();
		if(obj instanceof Animal)
			((Animal) obj).print();
	}
}

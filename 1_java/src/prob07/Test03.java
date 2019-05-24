package prob07;

public class Test03 {

	public static void main(String[] args) {
		Person a = new Student("홍길동",20,200201);
		Person b = new Teacher("이순신", 30,"JAVA");
		Person c = new Employee("유관순",40,"교무과");

		System.out.println("[출력값]");
		a.print();
		b.print();	
		Test03.personPrint(c);

	}
	
	
	public static void personPrint(Person e) {
		e.print();
	}
	

}

package prob07;

public class Test {

	public static void main(String[] args) {
		Student a = new Student("홍길동",20,200201);
		Teacher b = new Teacher("이순신", 30,"JAVA");
		Employee c = new Employee("유관순",40,"교무과");

		System.out.println("[출력값]");
		a.print();
		b.print();
		c.print();
		
		Student d = new Student("홍길동",20,200201);
		d.print();

	}

}

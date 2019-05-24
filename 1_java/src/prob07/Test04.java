package prob07;

public class Test04 {

	public static void main(String[] args) {
		Person[] p = { 
				new Student("홍길동", 20, 200201), 
				new Teacher("이순신", 30, "JAVA"), 
				new Employee("유관순", 40, "교무과"),
				new Student("박길동", 20, 200201), 
				new Student("김길동", 30, 200202), 
				new Student("고길동", 20, 200203)

		};
		
		for(Person data:p){
			personPrint(data);
		}
		
		for (int i= 0;i<p.length;i++) {
			if (p[i] instanceof Student){
				System.out.println(((Student)p[i]).id);
				System.out.println(p[i].getName().charAt(0)+"**");
				Student s = (Student) p[i];
			}
		}
		
		
	}

	public static void personPrint(Person e) {
		e.print();
	}

}

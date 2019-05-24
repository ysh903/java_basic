package day09;

public class Test01 {

	public static void main(String[] args) {
		Object msg1 = "hello java";
		String msg2 = "hello java";
		
		System.out.println(msg1.toString());//자동으로 넣어짐
		System.out.println(msg2);
		System.out.printf("msg1과 msg2와 같은가? ");
		System.out.println(msg1.equals(msg2));
		
		
		Employee emp1 = new Employee("홍길동","기술부");
		Employee emp2 = new Employee("홍길동","기술부");
		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.printf("emp1과 emp2와 같은가? ");
		System.out.println(emp1.equals(emp2));
		
		
		
	}

}

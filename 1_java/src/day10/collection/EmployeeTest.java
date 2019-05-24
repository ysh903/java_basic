package day10.collection;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * Employee<String> emp = new Employee<String>("홍길동", "2019001");
		 * 
		 * 
		 * System.out.println(emp.number.substring(0,4));
		 * 
		 * Employee<Integer> emp1 = new Employee<Integer>("김길동", 2019002); //숫자도 레퍼런스로
		 * 관리 System.out.println(emp1);
		 * 
		 * Employee emp2 = new Employee("고길동", "2019003"); //오브젝트 타입으로 관리
		 * System.out.println(emp2.number);
		 */

		Employee<String, String> emp1 = 
				new Employee<String, String>("홍길동", "2019-001");
		System.out.println(emp1);
		Employee emp2 = new Employee("Michael",9);
		System.out.println(emp2);

	}

}

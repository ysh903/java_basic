package prob07;

public class Employee extends Person {

	String dept="no name";
	
	public Employee(String name, int age,String dept) {
		super(name,age);

		this.dept=dept;
	}

	public void print() {
		super.print();
		System.out.printf("담당과목: %s\n",dept);
	}

}

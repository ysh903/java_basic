package prob07;

public class Teacher extends Person {

	String subject="no name";

public Teacher() {}

	public Teacher(String name, int age, String subject) {
		super(name,age);

		this.subject=subject;
	}

	public void print() {
		super.print();
		System.out.printf("담당과목: %s\n",subject);
	}

}

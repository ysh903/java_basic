package prob07;

public class Student extends Person {
	int id=0;
	
	public Student() {}
	
	public Student(String name, int age, int id) {
		super(name,age);
		if (id<0) {
			id=0;
		}
		this.id=id;
	}
	public void print() {
		super.print();
		System.out.printf("학   번: %d\n",id);
	}
}

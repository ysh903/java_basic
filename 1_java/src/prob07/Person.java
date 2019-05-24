/*각각의 객체에 대해 아래와 같은 조건에 맞게 클래스(Person , Student, Teacher, Employee)를 작성하세요.  

1) 부모 class Person을 정의하며  공통적으로 사용 되는 name 과 age를 정의하고  Student, Teacher, Employee  에서 물려 받도록 설계 한다.

2) 클래스 작성시 멤버변수를 직접 접근 못하도록 encapsulation시키기 위해 각 변수를 private으로 선언하고, 각 private member variable에 접근하기 위한 getter, setter member method를 선언하시오. (getter, setter method는 public으로 선언하고, 각 변수마다 만듦) 

3) Student, Teacher, Employee 클래스에, 멤버 변수의 내용을 출력하기 위한 print method를 구현하시오.

4) 각 클래스에는 멤버변수 값을 인자(argument)로 전달받아 객체를 생성할 수 있는 생성자(Constructor)를 정의하시오.

5)  print() 메소드의 실행 결과 화면.*/

package prob07;



public class Person {
	private String name="no name";
	private int age=0;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<0) {
			age=0;
		}
		this.age = age;
	}
	
	public void print() {
		System.out.printf("이름: %s \t나이: %d \t",name,age);
	}
	
	
}



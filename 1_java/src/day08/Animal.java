package day08;

public abstract class Animal extends Object {
	String kind = "동물의 종류";

	public Animal(String kind) {
		this.kind = kind;
	}

	public abstract void breath();
	
	

	public Animal() {
		super();
	}

	public void print() {

	}

}


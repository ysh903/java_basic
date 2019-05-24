package day08;

public interface Movable {
	public abstract void move();// Abstract만 가능 자동으로 처리됨
}

interface Drawable {
	void draw();
}

interface MovableAndDrawable extends Movable, Drawable {
	
}


class Circle implements MovableAndDrawable {

	@Override
	public void move() {
		System.out.println("Circle Move");

	}

	@Override
	public void draw() {
		System.out.println("Circle draw");

	}

}

class Rectangle implements MovableAndDrawable {

	@Override
	public void draw() {
		System.out.println("Rectangle draw");

	}

	@Override
	public void move() {

		System.out.println("Rectangle move");
	}

}

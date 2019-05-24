package prob08;

public class Circle extends Shape {
	private double radius;
	Circle(){}
Circle(String name, double radius){
	super(name);
	this.radius=radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
@Override
void calculationArea() {
	super.setArea(radius*radius*Math.PI);
	
}
}

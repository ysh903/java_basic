package prob08;

public class Rectangle extends Shape {
	private double width;
	private double hight;
	

	Rectangle(){}
	Rectangle(String name, double width, double hight){
		super(name);
		this.width=width;
		this.hight=hight;
	}
	

	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	@Override
	void calculationArea() {
		super.setArea(width*hight);
		
	}
}

package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		//System.out.println("");
	}

	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (this.width + this.height) * 2;
		return perimeter;
	}
}
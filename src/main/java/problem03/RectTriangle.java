package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = width * height / 2.0;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perameter = (width * width) + (height * height);
		perameter = Math.sqrt(perameter) + width + height;
		return perameter;
	}
}

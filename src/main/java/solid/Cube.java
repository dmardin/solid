package solid;

public class Cube implements Shape {
	private int a;
	private int b;
	
	public Cube(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double area() {
		return 4*a*b;
	}

}

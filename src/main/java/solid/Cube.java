package solid;

public class Cube implements Shape, ThreeDimensionalShape {
	private int a;
	
	public Cube(int a) {
		this.a = a;
	}
	
	@Override
	public double area() {
		return 4*a*a;
	}

	@Override
	public double volumne() {
		return Math.pow(a, 3);
	}

}

package solid;

public class NoShape implements Shape {

	// Liskov Substitution say: specific class NoShape should be able to implement
	// interfaces methods from Shape. Every subclass should be substitutable by
	// it base class.
	@Override
	public double area() {
		throw new IllegalArgumentException("Can not calculate Area.");
	}

}

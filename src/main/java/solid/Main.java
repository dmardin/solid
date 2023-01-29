package solid;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		AreaCalculator areaCalculator = new AreaCalculator();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube(5,5);
		Rectangle rectangle = new Rectangle(10, 2);
		ShapesPrinter printer = new ShapesPrinter();
//		Shape noShape = new NoShape();
		List<Shape> shapes = List.of(circle, square, cube, rectangle);
		int sum = areaCalculator.sum(shapes);
		System.out.println(printer.json(sum));
		System.out.println(printer.csv(sum));
	}
}

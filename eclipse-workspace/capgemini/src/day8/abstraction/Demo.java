package day8.abstraction;

public class Demo {

	public static void main(String[] args) {
		Square s = new Square();
		s.calArea();
		s.show();
		
		Shape shape;
		shape = new Square(21.5f);
		
		shape.calArea();
		shape.show();
	}

}

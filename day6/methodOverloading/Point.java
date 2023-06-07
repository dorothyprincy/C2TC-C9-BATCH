package day6.methodOverloading;

public class Point {
	private float y;
	private float z;
	
	public Point() {
		y = 0.0f;
		z = 0.0f;
	}
	public Point(float y) {
		this.y = y;
		this.z = y;
	}
	public Point(float y, float z) {
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [y=" + y + ", z=" + z + "]";
	}
}

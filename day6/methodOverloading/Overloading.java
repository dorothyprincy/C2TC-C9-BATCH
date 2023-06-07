package day6.methodOverloading;

public class Overloading {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a) {
		return a;
	}
	public static double add(int a, double b) {
		return a+b;
	}
	public static float add(float a, int b) {
		return a+b;
	}
	public static float add(float a, float b) {
		return a+b;
	}
	public static String add(String a, String b) {
		return a+b;
	}
}
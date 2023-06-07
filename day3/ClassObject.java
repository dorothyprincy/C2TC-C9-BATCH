package day3;

public class ClassObject {
	void one() {
		System.out.println("Method one");
	}
    void two() {
    	System.out.println("Method two");
    }
	public static void main(String[] args) {
		ClassObject obj=new ClassObject();
		System.out.println("Method main");
		obj.one();
		obj.two();

}
}
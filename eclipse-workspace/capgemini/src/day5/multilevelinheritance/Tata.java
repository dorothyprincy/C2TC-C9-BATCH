package day5.multilevelinheritance;

public class Tata extends Car{
   void symbol() {
	System.out.println("Symbol");
}
   void founder() {
	   System.out.println("Founder");
   }
	public static void main(String[] args) {
		Tata t = new Tata();
		t.symbol();
		t.founder();
		t.brake();
		t.speed();
		t.color();
	}

}

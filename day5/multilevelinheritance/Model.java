package day5.multilevelinheritance;

public class Model  extends Tata{
     void name() {
    	 System.out.println("Name");
     }
     void price() {
    	 System.out.println("Price");
     }
     void mileage() {
    	 System.out.println("Mileage");
     }
	public static void main(String[] args) {
		Model m = new Model();
		m.name();
		m.price();
		m.mileage();
		m.symbol();
		m.founder();
		m.brake();
		m.speed();
		m.color();
	}

}

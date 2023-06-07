package day5.multilevelinheritance;

public class Car {
   public void speed() {
	   System.out.println("Speed");
   }
   public void brake() {
	   System.out.println("Brake");
   }
   public void color() {
	   System.out.println("Color");
   }
   public static void main(String[] args) {
		Car c = new Car();
		c.brake();
		c.speed();
		c.color();
	}
}

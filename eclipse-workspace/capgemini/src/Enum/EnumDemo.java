package enums;

public class EnumDemo {
	public static void main(String args[]) {
	      Vehicle vehicles[] = Vehicle.values();
	      for(Vehicle veh: vehicles) {
	         System.out.println("Price of "+veh+" is: "+veh.getPrice());
	      }
	   }

}

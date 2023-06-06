package day5.Inheritance;

public class Citizen {
     private String name;
     private String address;
     private long phno;
      public Citizen(String name, String address, long phno) {
		super();
		this.name = name;
		this.address = address;
		this.phno = phno;
	}

	public Citizen() {
		System.out.println("Citizen created an object");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", phno=" + phno + "]";
	}
    
}

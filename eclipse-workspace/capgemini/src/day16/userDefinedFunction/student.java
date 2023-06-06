package day16.userDefinedFunction;

public class student implements Comparable<student>{
	private int rollNo;
	private String name;
	private float pr;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPr() {
		return pr;
	}
	public void setPr(float pr) {
		this.pr = pr;
	}
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int rollNo, String name, float pr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.pr = pr;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + ", pr=" + pr + "]";
	}
	@Override
	public int compareTo(student s) {
		return this.name.compareTo(s.name);
	}

}

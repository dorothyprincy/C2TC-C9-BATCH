package day15.userDefindFunction;

public class Student {
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
	public Student(int rollNo, String name, float pr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.pr = pr;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", pr=" + pr + "]";
	}

}

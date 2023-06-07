package day3;

public class Encaps {
	private int id;
	private String name;
	public int getid() {
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Encaps [id=" + id + ", name=" + name + "]";
	}

}

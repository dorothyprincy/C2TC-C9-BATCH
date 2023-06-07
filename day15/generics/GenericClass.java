package day15.generics;

public class GenericClass<T> {
	T obj;
	void add(T obj) {
			this.obj=obj;
	}
	T get() {
		return obj;
	}

	public static void main(String[] args) {
		GenericClass<String> obj= new GenericClass<String>();
		obj.add("Hii everyone");
		System.out.println(obj.get());

	}

}

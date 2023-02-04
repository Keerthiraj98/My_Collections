package arrayList;

import java.util.ArrayList;

public class ArrayExample2 {

	public static void main(String[] args) {
		ArrayList <String> name = new ArrayList<String>	();		
		name.add("Ruby");
		name.add("Rohith");
		name.add("Leeda");
		name.add("Dhanya");
		System.out.println(name);
		name.set(0, "Rohith");
		System.out.println(name);
		name.set(3, "Mnju");
		System.out.println(name);
}
}
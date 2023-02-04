package arrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList <String> al = new ArrayList<String>();		//generics(<>) // creating arraylist of string type
		al.add("Ruby");
		al.add("Rohith");
		al.add("Leeda");
		al.add("Dhanya");
		System.out.println(al);
		Iterator <String> itr = 	al.iterator(); //interface to travel b/w 2 elements
		while(itr.hasNext()); // hasnext is a method in iterator interface
		{
			System.out.println(itr.next());
		}
	}	
	

}

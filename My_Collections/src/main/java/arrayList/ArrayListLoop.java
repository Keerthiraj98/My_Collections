package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(3);
		arl.add(45);
		arl.add(3);
		arl.add(56);
		System.out.println("For Loop");
		for (int counter = 0; counter < arl.size(); counter++) {
			System.out.println(arl.get(counter));
		}
		System.out.println("While Loop");
		int count = 0;
		while (arl.size() > count) {
			System.out.println(arl.get(count));
			count++;
		}
		System.out.println("For Each/Advanced ForLoop");
		for (Integer num : arl) {
			System.out.println(num);
		}
		System.out.println("Iterator");
		Iterator itr = arl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

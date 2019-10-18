package sample;

import java.util.LinkedList;
import java.util.ListIterator;

public class list {
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		ListIterator<Integer> itr=obj.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

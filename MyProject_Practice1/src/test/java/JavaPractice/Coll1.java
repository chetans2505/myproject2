package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Coll1 {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("chet");
		ll.add("chetan");
		ll.set(1, "chester");

		System.out.println(ll);

		ArrayList al = new ArrayList();
		al.add("s");
		al.add("s");
		//al.set(1, "w");
		System.out.println(al);

		LinkedHashMap m = new LinkedHashMap();
		m.put(10, 123);
		m.put(10, 123);
		// System.out.println(m);
		m.put(11, 123);
		m.put(5, 123);
		m.put(9, 123);
		m.put(15, 123);
		System.out.println(m);
		TreeSet tr = new TreeSet();
		tr.add(100);
		tr.add(99);
		System.out.println(tr);
	}
}

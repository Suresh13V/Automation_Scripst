package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class JavaPackA {

	public void ABD() {

		System.out.println(" 1st package");
	}
	public static void main(String[] args) {

		List ex = new ArrayList();
		ex.add(100);
		ex.add(1000);
		System.out.println(ex);
		System.out.println(ex.contains(100));
		System.out.println(ex.indexOf(1000));
		System.out.println(ex.isEmpty());
		System.out.println(ex.lastIndexOf(1000));
		ex.clear();
		System.out.println(ex);


		List<String> str = new ArrayList<String>();
		Set st = new HashSet<String>();
		st.add(867);
		st.add("value");
		System.out.println(st);
		System.out.println(ex.indexOf(1));



		Map<String,String> map = new TreeMap<String,String>();

		map.put("A", "Suresh");
		map.put("C", "Vengat");
		map.put("B", "Ramesh");
		System.out.println(map);

		for (Entry<String, String> s : map.entrySet()) {
			System.out.println(s);
			System.out.println(s.getKey());
			System.out.println(s.getValue());

			
			
		}

		for (String s : map.keySet()){

			System.out.println(s);

		}

		for (String s : map.values()){

			System.out.println(s);

		}
		
		System.out.println(map.get("A"));

	}
}



package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		List str1 = new ArrayList();
		List<Integer> str = new ArrayList<Integer>();
		//str.add(10);
		str.add(11);
		str.add(12);
		str.add(13);
		str.add(14);
		str.add(14);
		str.add(11);
		
		for(int two : str) {
			
			List lis = new ArrayList();
			if(str.contains(two)) {
				lis.add(two);
				System.out.println(lis);
			}else 
			
			//boolean abs = str.contains(two);
			
			//lis.add(abs);
			System.out.println(lis);
			
			
			
			int thrid = 0;
			if(two==thrid) {
				thrid = two;
			}thrid=two;
		}
		
		
		
		/*
		 * for(int i = 0; i<str.size(); i++) { System.out.println(str.get(i)); }
		 */
		
		int i = 0 ;
		/*
		 * while(i<str.size()) { System.out.println(str.get(i)); i++; }
		 */
		do {
			System.out.println(str.get(i));
			i++;
		}while (i<str.size());
		
		
		/*
		 * for(Integer one : str) { System.out.println(one); }
		 * 
		 * 
		 * boolean br = str.isEmpty(); str.get(0); str1.add("String");
		 * //str1.addAll(str); System.out.println(str1.containsAll(str));
		 * System.out.println(str); System.out.println(br); System.out.println(str1);
		 */	
	}

}

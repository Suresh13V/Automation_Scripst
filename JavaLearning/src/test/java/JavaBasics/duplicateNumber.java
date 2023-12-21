package JavaBasics;

import java.util.ArrayList;


class A{
	
	A() {
		System.out.println(" isgfsdhfhds ");
	}
	
	
}
public class duplicateNumber extends A {
	
	public static void  duplicate() {
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A c = new A();
	
	
		
		
		int[] a = {1,2,3,4,5,1,2};
		
		 ArrayList<Integer> 
         newList = removeDuplicates();
		 
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]) {
					System.out.println("duplicate value :"+a[i]);
					System.out.println();
					int s=a[i];
					
				}
		}
			
		}

	}

	



	private static ArrayList<Integer> removeDuplicates() {
		// TODO Auto-generated method stub
		return null;
	}

}

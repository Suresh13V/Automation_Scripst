package JavaBasics;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		byte b = 2;
		short s = 34;
		int t = 4798;
		long l = 456456l;
		float f = 4.34764356978654567f;
		double d = 4.345656567865456d;
		char c = 'C';
		boolean o = true;
		
		System.out.println( "b as = " + b);
		System.out.println( "s as = " + s);
		System.out.println( "t as = " + t);
		System.out.println( "f as = " + f);
		System.out.println( "c as = " + c);
		System.out.println( "o as = " + o);
		System.out.println( "l as = " + l);
		System.out.println( "d as = " + d);
		
		String one = "Public Private class";
		
		System.out.println(one.concat(one));
		
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
		int time = 18;
	    String result;
	    result = (time < 18) ? "Good day." : "Good evening.";
	    System.out.println(result);
	    
	    String time1 = "two";
	    String result1 = (time1 == "two") ? "Good day." : "Good evening.";
	    System.out.println(result1);
	    
	    int[][] myNumbers = { {1, 2, 3, 4,5}, {6, 7,8,9} };
	     for (int i = 0; i < myNumbers.length; ++i) {
	        for(int j = 0; j < myNumbers[i].length; ++j) {
	           System.out.println(myNumbers[i][j]);
	        }
	     }
	    
	    
	    
	}

}

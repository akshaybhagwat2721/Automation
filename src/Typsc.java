public class Typsc{
	public static void main(String[]args) {
	
		//type casting converting data from one datatype to another datatype there are two types of type casting 
		// premetive data type casting 
		// non premetive datatype casting
		//implicit type casting- converting lower datatype to higher data type is know as inplicit type casting
		// explicit type casting- converting data from highere data type to lower data type is know as explicit type casting
		
		int a=100;
		long l=a;//imlicit type casting
		
		int b=200;
		short s=(short)b;
		System.out.println(s);
		System.out.println(l);
		
		double d=100.222;
		int i=(int)d;
		System.out.println(i);
		
	}
}
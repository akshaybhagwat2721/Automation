
public class Operators {
	
		void arithmatic()
		{
			System.out.println(10+10);//addition 
			System.out.println(15-10);//substraction
			System.out.println(20*12);//multiplication
			System.out.println(30/5);//division 
			System.out.println(10%3);//modul
			
			System.out.println("Akshay"+"Bhagwat");
			System.out.println(10+"Akshay"+(10/2)*2+"Akshay");//Singel line comment
			
			int a=100;
			System.out.println(a);
				
		}
		void unary()
		{
			//post increment //pre increment //post decrement //pre decrement
			int a=10;
			int b=20;
			System.out.println(a++ + ++b);//31 //a=11/b=21
			System.out.println(--a - a--);//0  //a=9
			System.out.println(++a + ++b);//32 //a=10 b=22
			System.out.println(a);
			System.out.println(b);
		}
		
		
		public static void main(String[]args) {
			Operators o=new Operators(); 			
			o.arithmatic();
			o.unary();
			
			
		}
		
	

}


// type Cast operators
class MainMethodDemo1
{
	String s = "Java";
	public static void main(String args[]){
		{
			double d = 23.0;
			int x = 'a';
			System.out.println("double value = "+d);
			System.out.println("int x value converts to char = "+x);
			
			// explicit type cast
			int y = 29;
			byte b = (byte)y;
			System.out.println("byte value = "+b);
			
			// compound operators
			int a = 10;
			a+=20;
			System.out.println("Compound operator value = "+a);
			
			//Conditional Operator
			int a1 = (10<20)?30:40; // True so 30
			int a2 = (30<20)?30:40; // false so 40
			System.out.println("Cond Oper a1 = "+a1);
			System.out.println("Cond Oper a2 = "+a2);
			
			//instanceof operator
			MainMethodDemo1 mmd1 = new MainMethodDemo1();  
			System.out.println(mmd1 instanceof MainMethodDemo1);//true  
		}
	}
		
}
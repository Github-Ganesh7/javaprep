class ArraysDemo1
{
	public static void main(String [] args){
		
		int [] a = new int[3];
		int [] a2 = new int[3][5];
		a[0] = 2;
		a[1] = 22;
		a[2] = 222;
		//a[3] = 2222; RE --> IndexOutOfBoundsException
		//int [] a2 = new int[-3]; RE --> NegativeArraySizeException
		System.out.println("result from array a - " + a[2] + "---" + a[1]);
		
		// Sring array
		String [] s1 = new String[2];
		s1[0] = "four";
		s1[1] = "String2";
		System.out.println("result from s1 array - "+s1[1]);
		
		// String Array re-assigning
		String [] bangalore = {"cubbon","krpuram","majestic"};
		System.out.println("bangalore array result - " + bangalore[1]);
		bangalore[0] = "cubbon Park";
		bangalore[1] = "krpuramRS";
		System.out.println("bangalore array length - " + bangalore.length);
		System.out.println("bangalore re-assign result - " + bangalore[1]);
		System.out.println("First String is " + bangalore[0] +" and it has "+ bangalore[0].length() + " Chars");
		
		String[] argh = {"x","y","z"};
		args=argh;
		for(String s : args){
			System.out.println("looping array - "+s);
		}
		
		// Sum of elemnts in arrays
		int [] sum = new int[]{12, 13, 14};
		int total=0;
		for(int x1 : sum){
			total = total+x1;
		}
		System.out.println("sum = "+total);
		
		//length vs length()
		System.out.println("array a's length is =" +" " + a.length);
		//System.out.println("array a's length is =" +" " + a.length()); Compiler Error
		
		System.out.println("First String is " + s1[0] +" and it has "+ s1[0].length() + " Chars");
		
	}
}
/*
Finding the datatype for input
*/

import java.util.*;

class HackerRank8
{
	public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
				
				// validating with range known values
                /*if(x>=-128 && x<=127){
					System.out.println("* byte");
				}
				if(x>=-32768 && x<=32767){
					System.out.println("* short");
				}
                if(x>=-2147483648 && x<=2147483647){
					System.out.println("* int");
				}
                if(x>=-9223372036854775808L && x<=9223372036854775807L){
					System.out.println("* long");
				}*/
				
				// validating with MIN and MAX methods
				if(x>=Byte.MAX_VALUE && x<=Byte.MAX_VALUE){
					System.out.println("* byte");
				}
				if(x>=Short.MAX_VALUE && x<=Short.MAX_VALUE){
					System.out.println("* short");
				}
                if(x>=Int.MAX_VALUE && x<=Int.MAX_VALUE){
					System.out.println("* int");
				}
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
					System.out.println("* long");
				}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
		sc.close();
    }

}
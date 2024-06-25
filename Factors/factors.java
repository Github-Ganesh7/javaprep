import java.util.Scanner;

class Factors
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int count = 0;
			for (int  j = 1; j<=29; j++){
				if(i%j == 0){ 
					count++;
				}
	}
	if(count == 2){
		System.out.println("Prime");
	}else {
		System.out.println("Non Prime");
	}
	}
}
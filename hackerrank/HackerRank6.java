/*Task
Given an integer, N , print its first 10 multiples. 
Each multiple N*i (where 1<=i<=10) should be printed 
on a new line in the form: N x i = result.

Sample Input : 2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
.
.
.
*/

import java.util.*; 

class HackerRank6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i<=10;i++){
			int p = n*i;
			System.out.println(n +" x " + i + " = " + p);
		}

    }
}

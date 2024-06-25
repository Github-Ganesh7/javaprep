/*
we use a=5, b=3, n=5 to produce some series 
s0 = 5 + 1*3 = 8
s1 = 5 + 1*3 + 2*3 = 14
s2 = 5 + 1*3 + 2*3 + 4*3 = 26
.
.
s5 = --------------- = 98

s0 = a + 1*b = --
s1 = a + 1*b + 2*b = ------
s2
s3
s4 = ------------------- = ---
*/

import java.util.*;

class HackerRank7
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q = sc.nextInt();
	for(int i=0;i<q;i++){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int w = 1;
		int ts;
		int count = 1;
			ts = a;
			while(count<=n){
				ts = ts+w*b;
				w=w*2;
				count++;
				System.out.print(ts+" ");
			}
			/*for(int y=1; y<=n; y++) {
				ts = ts+w*b;
				w=w*2;
				System.out.print(ts+" ");
			}*/
			System.out.println("\n");
		}
	}
}
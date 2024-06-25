import java.util.*; 

class HackerRank3
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if(num%2!=0){
			System.out.println("odd number Wierd");
		} else {
			if(num>=2 && num<=5){
				System.out.println("even range 2 t0 5 - *Not Wierd*");
			} else if (num>=6 && num<=20){
				System.out.println("even range 6 t0 20 *Wierd*");
			} else {
				System.out.println("greater than 20 *Not Wierd*");
			}
		}
    }
}
class VarArgMethodDemo1
{
	public static void main(String args[]){
		
		sum();
		sum(10,20);
		sum(67,89,34);
		sum(35,12,9,765);
	}
	public static void sum(int...x){
		int total = 0;
		for(int x1 : x){
			total = total+x1;
		}
		System.out.println("sum of args = " + total);
	}
}
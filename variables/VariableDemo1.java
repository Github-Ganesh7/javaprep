class VariableDemo1
{
	double x;
	int x1 = 10;
	{
	System.out.println("Instace value from ins Area - " + x1);
	}
	static int si = 20;
	static int si1;
	final/*static*/ int locVar1 = 30;
	public static void main(String[]args){
		int x2 = 10;
		
		int locVar2 = 40;
		
		VariableDemo1 insobj = new VariableDemo1();
		System.out.println("x instance default value " + insobj.x);
		System.out.println("x1 instance  " + insobj.x1);
		System.out.println("x2 static  " + x2);
		System.out.println("si Static int value " + si);
		System.out.println("si Static int value by obj ref " + insobj.si);
		System.out.println("si1 Static int default value " + insobj.si1);
		//System.out.println("Local Variable value = " + locVar1);
		System.out.println("locVar2 Local Variable value = " + locVar2);
	}
}
import java.util.*; 


class Number
{
	public static void main(String[] args)
	{
		List<Integer> evenlist = new ArrayList<>();
		List<Integer> oddlist = new ArrayList<>();
		List<Integer> primelist = new ArrayList<>();
		List<Integer> evenprimelist = new ArrayList<>();
		Map<String,List<Integer>> numbersmap = new HashMap<>();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		
		for (int  i = 0; i<=n; i++) {
			if(i%2 == 0){
				if(i == 2){
					evenprimelist.add(i);
					evenlist.add(i);
				} else {
					evenlist.add(i);
				}
			} else {
				oddlist.add(i);
				int count = 0;
				for (int  j = 1; j<=n; j++){
				if(i%j == 0){ 
					count++;
				}
			}
				if(count == 2){
					primelist.add(i);
				}
			}
		}
		//System.out.println("even Numbers" + evenlist);
		//System.out.println("prime Numbers" + prime);
		//System.out.println("odd Numbers" + odd);
		
		numbersmap.put("evenlist", evenlist);
		numbersmap.put("oddlist", oddlist);
		numbersmap.put("primelist", primelist);
		numbersmap.put("evenprimelist",evenprimelist);
		
		System.out.println(numbersmap);
		
		/*if(s.contains("odd")){
			System.out.println(numbersmap.get("oddlist"));
		}
		else if (s.contains("prime")){
			System.out.println(numbersmap.get("primelist"));	
		} 
		else if (s.contains("even")){
			System.out.println(numbersmap.get("evenlist"));	
		}*/
		
		switch(s)
		{
			case "odd" : 
				System.out.println(numbersmap.get("oddlist"));
			break;
			
			case "even" :
			System.out.println(numbersmap.get("evenlist"));
			break;
			
			case "prime" :
			System.out.println(numbersmap.get("primelist"));
			break;
			
			case "evenprime" :
			System.out.println(numbersmap.get("evenprimelist"));
			break;
			
			default:
			System.out.println("not matched");
		}
	}
}
public class LinearSearch {
	
	public static void main(String[] args){
		
		int[] num = new int[args.length - 1];
		
		try{
		
			for (int i = 1; i < args.length; ++i){
			
				num[i - 1] = Integer.parseInt(args[i]);
			}
		} 
		
		catch (Exception e){
			System.exit(-1);
		}
		
		for (int i = 0; i < num.length; ++i){
			
			System.out.print(num[i] + " ");
			
		}
		
		System.out.print('\n');
		
		if(search(num, Integer.parseInt(args[0]))){
			
			System.out.println("true");
			
		} else {
			
			System.out.println("false");
			
		}
	}

	public static boolean search(int[] num, int key){
		
		for (int i = 0; i < num.length; ++i){
			
			if (num[i] == key){
				
				return true;
			}
		}
		return false;
	}
}

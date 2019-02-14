package maxTrain;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World.");
			
			int i = 0;
			String str ="Hello to all";
			boolean	b  = true;
			int[] ints = {1,2,3,4,5,6,7,8,9,10};			
			if(b == true) {}
			for(int idx = 0; idx <5; idx++) {}
			while (i <10) {
				i++;
			}
			// foreach(var idx in ints){}
			for(int idx : ints) {}
			int a = 5 % 2;
						
			
			int total = 0;
			
			for(int idx: ints) {
				if (idx % 2 ==0) {
				total += idx;
				}
			}
			System.out.println(total);
			
	}

}

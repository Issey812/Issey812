package loop;

public class Task5 {

	public static void main(String[] args) {
		
		
		for(int a = 1; a <= 9; a++) {
		for(int b = 1; b <= 9; b++) {
		
			if(a*b < 10) {
			System.out.print("  " + a*b);
			}else{System.out.print(" " + a*b);
			}
			
			}
		System.out.println();
		}
		
		
	}
	
}

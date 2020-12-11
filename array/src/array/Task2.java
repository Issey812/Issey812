package array;

public class Task2 {

	public static void main(String[] args) {
		int array[] = {7,6,5,4,3,2,1};
		
		for(int i : array) {
			if(i == 1) {System.out.println(i);
		}else {System.out.print(i + ",");
		}			
	}
	
		//i < array.lengthだと逆順のときに7に及ばない
		for(int i = 1; i <= array.length; i++) {
			if(i == 7) {System.out.print(i);
			}else{System.out.print(i + ",");
		}
		}
	}
}

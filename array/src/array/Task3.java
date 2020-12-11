package array;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		
		System.out.print("[");
		
		Random r = new Random();
		int[] array = new int[6];
		array[0] = r.nextInt(10);
		array[1] = r.nextInt(10);
		array[2] = r.nextInt(10);
		array[3] = r.nextInt(10);
		array[4] = r.nextInt(10);
		array[5] = r.nextInt(10);
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {System.out.print(array[i]);
		}else {System.out.print("," + array[i]);
		}
		}
		System.out.println("]");
		
		
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大値: " + max);
		
		int min = 10;
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("最小値: " + min);
	}
}


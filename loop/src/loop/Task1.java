package loop;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("数字を入力してください: " + num );
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1～" + num + "までの合計: " + sum );
	}

}

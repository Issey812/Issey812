package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("数字を入力してください: " + num );
		
		int K = 0;
		while(1 <= num) {
			K ++;
			num = num / 10;
		}
		
		System.out.println("桁数: " + K);
		
	}

}

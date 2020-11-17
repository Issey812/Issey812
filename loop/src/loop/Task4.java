package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("正の整数を入力してください: " + num );
		
		System.out.print(num + "の約数: ");
		
		for(int i = 1; i <= num; i++) {
		if(num % i == 0) {
			if(i != num) 
			System.out.print(i + ",");
		    if(i == num){System.out.print(i);
		}
		}
	}
	}
}

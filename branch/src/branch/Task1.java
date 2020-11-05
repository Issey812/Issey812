package branch;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();
		
		
		if(num >= 10) System.out.println("値: " + num);
		if(num < 10) System.out.println("値: " + num*10);

	}

}

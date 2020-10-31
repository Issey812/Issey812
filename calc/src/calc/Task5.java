package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
	
		String a = "ノートPCの値段; ";
				int b = 89800;
				char c = '円';
				
		System.out.println(a + b + c);
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str2);
		sc.close();
	}

}

package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.print("1から5までの数字を入力してください");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		String moji;
		switch(num) {
			case 1:
				moji = " -> Ⅰ";
				break;
			case 2:
				moji = " -> Ⅱ";
				break;
			case 3:
				moji = " -> Ⅲ";
				break;
			case 4:
				moji = " -> Ⅳ";
				break;
			case 5:
				moji = " -> ⅴ";
				break;
			default:
				moji = " -> unknown";
				break;
		
		 
		}
		System.out.println(num + moji);
		
	}

}

package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		System.out.println(numA);
		int numB = sc.nextInt();
		System.out.println(numB);
		int numC = sc.nextInt();
		System.out.println(numC);
		sc.close();
		
		
		if(numA == numB && numB == numC) {System.out.println("最大値: " + numA);
		}else if(numA >= numB && numA >= numC) {System.out.println("最大値: " + numA);
		}else if(numB >= numA && numB >= numC) {System.out.println("最大値: " + numB);
		}else if(numC >= numA && numC >= numB) {System.out.println("最大値: " + numC);
		}
		
			

	}
}


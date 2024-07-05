package step1;

import java.util.Scanner;

public class Test05 {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double result = (double) a / b;
		
		System.out.println(result);
		
		sc.close();
	}
}

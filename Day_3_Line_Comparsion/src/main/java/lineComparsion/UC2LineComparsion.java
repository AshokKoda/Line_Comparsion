package lineComparsion;

import java.util.Scanner;

public class UC2LineComparsion {

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3, x4, y4;
		double a, b;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X1 value: ");
		x1 = sc.nextInt();
		System.out.println("Enter Y1 value: ");
		y1 = sc.nextInt();
		System.out.println("Enter X2 value: ");
		x2 = sc.nextInt();
		System.out.println("Enter Y2 value: ");
		y2 = sc.nextInt();
		System.out.println("Enter X3 value: ");
		x3 = sc.nextInt();
		System.out.println("Enter Y3 value: ");
		y3 = sc.nextInt();
		System.out.println("Enter X4 value: ");
		x4 = sc.nextInt();
		System.out.println("Enter Y4 value: ");
		y4 = sc.nextInt();
		
		a = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);
		
		if(a==b) 
		{
			System.out.println("Two lines are equal: " + a + " = " + b);
		}else {
			System.out.println("Two lines are not equal: " + a + " =  "+ b);
		}

	}
}

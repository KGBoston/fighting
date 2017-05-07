package day03;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("输入两整数（空格空开）:");
		int a = i.nextInt();
		int b = i.nextInt();
		int bigger = a>b ? a:b;
		System.out.println(bigger+"比较大");
	}
}

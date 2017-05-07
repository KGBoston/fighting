package day03;

import java.util.Scanner;

public class homework08 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("输入三个数。。。");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		int max = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("最大的是：" + max);
	}
}

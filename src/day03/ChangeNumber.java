package day03;

import java.util.Scanner;

public class ChangeNumber {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("����һ����λ������");
		int m = i.nextInt();
		int a,b,c,d;
		a = m/1000;
		b = m/100 - 10*a;
		d = m%10;
		c = (m%100 - d)/10;
		System.out.println("��һ�����ǣ�"+d+c+b+a);
	}
}

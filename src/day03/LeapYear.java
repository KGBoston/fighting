package day03;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("��������ݣ� ");
		int year = a.nextInt();
		boolean flag = (year%4==0 && year%100!=0) || year%400==0;
		String msg = flag ? year+"������":year+"��������";
		System.out.println(msg);
	}
}

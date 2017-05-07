package day03;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("请输入年份： ");
		int year = a.nextInt();
		boolean flag = (year%4==0 && year%100!=0) || year%400==0;
		String msg = flag ? year+"是闰年":year+"不是闰年";
		System.out.println(msg);
	}
}

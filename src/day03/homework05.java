package day03;

import java.util.Scanner;

public class homework05 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("输入年份：");
		int year = i.nextInt();
		if(((year%4==0&&year%100!=0)||year%400==0)==true){
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}

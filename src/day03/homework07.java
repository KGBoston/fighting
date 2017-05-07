package day03;

import java.util.Scanner;

public class homework07 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int day = 0;
		System.out.println("输入年份：");
		int a = i.nextInt();
		System.out.println("输入月份：");
		int b = i.nextInt();
		switch(b){
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if(((a%4==0&&a%100!=0)||a%400==0)==true){
				day =29;
			}else{
				day = 28;
			}
			break;
		default:
			day = 31;
	
		}
		System.out.println(a+"年"+b+"月一共"+day+"天");
}
}

package day03;

import java.util.Scanner;

public class homework06 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("输入税前工资：");
		double salary = i.nextDouble();
		double tax = 0;
		salary -= 3500;
		if(salary<=1500){
			tax = salary * 0.03;
		}else if(salary<=4500){
			tax = salary * 0.1 -105;
		}else if(salary<=9000){
			tax = salary * 0.2 -555;
		}else if(salary<=35000){
			tax = salary * 0.25 -1005;
		}else if(salary<=55000){
			tax = salary * 0.3 - 2755;
		}else if(salary<=80000){
			tax = salary * 0.35 - 5505;
		}else{
			tax = salary *0.45 - 13505;
		}
		System.out.println("要交掉"+tax+"...");
}
}

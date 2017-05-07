package day03;

import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("输入单价：");
		double price = a.nextDouble();
		System.out.println("输入数量：");
		double number = a.nextDouble();
		System.out.println("输入付款金额：");
		double total = a.nextDouble();
		double money = price*number;
		if(money>=500){
			money *= 0.8;
		}
		if(total>=money){
			double back = total - money;
			System.out.println("实收："+money+"  找零："+back);
		}else{
			System.out.println("nonono");
		}

	}
}

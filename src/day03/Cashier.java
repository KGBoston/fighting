package day03;

import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���뵥�ۣ�");
		double price = a.nextDouble();
		System.out.println("����������");
		double number = a.nextDouble();
		System.out.println("���븶���");
		double total = a.nextDouble();
		double money = price*number;
		if(money>=500){
			money *= 0.8;
		}
		if(total>=money){
			double back = total - money;
			System.out.println("ʵ�գ�"+money+"  ���㣺"+back);
		}else{
			System.out.println("nonono");
		}

	}
}

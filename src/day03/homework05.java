package day03;

import java.util.Scanner;

public class homework05 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("������ݣ�");
		int year = i.nextInt();
		if(((year%4==0&&year%100!=0)||year%400==0)==true){
			System.out.println("����");
		}else{
			System.out.println("��������");
		}
	}
}

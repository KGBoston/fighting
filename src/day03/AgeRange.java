package day03;

import java.util.Scanner;

public class AgeRange {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���������䣺 ");
		int age = a.nextInt();
		if(age>=18&&age<=50){
			System.out.println("������18-50֮��");
		}else{
			System.out.println("���䲻��18-50֮��");
		}

	}
}

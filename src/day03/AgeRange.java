package day03;

import java.util.Scanner;

public class AgeRange {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("请输入年龄： ");
		int age = a.nextInt();
		if(age>=18&&age<=50){
			System.out.println("年龄在18-50之间");
		}else{
			System.out.println("年龄不在18-50之间");
		}

	}
}

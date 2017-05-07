package day03;

import java.util.Scanner;

public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("选择功能：1.显示全部 2.查询登录记录 0.退出");
		int command = a.nextInt();
		switch(command){
		case 1:
			System.out.println("显示全部");
			break;
		case 2:
			System.out.println("查询登录");
			break;
		case 0:
			System.out.println("退出");
			break;
		default:
			System.out.println("输入错误");
		}
	}
}

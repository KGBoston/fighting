package day03;

import java.util.Scanner;

public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("ѡ���ܣ�1.��ʾȫ�� 2.��ѯ��¼��¼ 0.�˳�");
		int command = a.nextInt();
		switch(command){
		case 1:
			System.out.println("��ʾȫ��");
			break;
		case 2:
			System.out.println("��ѯ��¼");
			break;
		case 0:
			System.out.println("�˳�");
			break;
		default:
			System.out.println("�������");
		}
	}
}

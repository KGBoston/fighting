package day04;
import java.util.Random;
import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
		Random a = new Random();
		Scanner i = new Scanner(System.in);
		int ans = a.nextInt(100) + 1;
		System.out.println("1-100��һ����");
		int guess;
		int count = 0;
		do{
			count += 1;
			guess = i.nextInt();
			if(guess>ans){
				System.out.println("̫���˰�");
			}else if(guess<ans){
				System.out.println("̫С�˰�");
			}
		}while(guess!=ans);
		System.out.println("�ۣ����ˣ�����"+count+"�Ρ���");
	}
}

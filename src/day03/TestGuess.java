package day03;

import java.util.Scanner;

public class TestGuess {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("��һ���£�1-1000������0�˳�");
		int ans = (int)(Math.random()*1000)+1;
		int guess = a.nextInt();
		int time = 1;
	
		while(guess!=ans){
			if(guess==0){
				System.out.println("������");
				break;
			}else if(guess>ans){
				System.out.println("too big");
			}else{
				System.out.println("too small");
			}
			time++;
			guess = a.nextInt();
		}
		if(guess==ans){
			System.out.println("�ۣ�"+time+"�ξͲ¶��ˣ�");
		}
		
	}
}

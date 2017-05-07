package day03;

import java.util.Scanner;

public class TestGuess {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("猜一个呗，1-1000整数，0退出");
		int ans = (int)(Math.random()*1000)+1;
		int guess = a.nextInt();
		int time = 1;
	
		while(guess!=ans){
			if(guess==0){
				System.out.println("不玩了");
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
			System.out.println("哇！"+time+"次就猜对了！");
		}
		
	}
}

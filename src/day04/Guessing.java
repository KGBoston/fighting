package day04;
import java.util.Random;
import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
		Random a = new Random();
		Scanner i = new Scanner(System.in);
		int ans = a.nextInt(100) + 1;
		System.out.println("1-100猜一个！");
		int guess;
		int count = 0;
		do{
			count += 1;
			guess = i.nextInt();
			if(guess>ans){
				System.out.println("太大了啊");
			}else if(guess<ans){
				System.out.println("太小了啊");
			}
		}while(guess!=ans);
		System.out.println("哇！对了！猜了"+count+"次。。");
	}
}

package day04;
import java.util.Scanner;

public class AddTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		for(int i=1;i<=10;i++){
			System.out.print("("+i+"):");
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int ans = a+b;
			System.out.print(a+"+"+b+"= ?");
			int k = s.nextInt();
			if(k==-1){
				System.out.println("bye");
				break;
			}else if(k==ans){
				System.out.println("bingo");
				score+=10;
			}else if(k!=ans){
				System.out.println("...´í");
			}
		}
		System.out.println("×Ü·Ö£º"+score);
	}
}

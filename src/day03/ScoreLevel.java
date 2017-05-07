package day03;

import java.util.Scanner;

public class ScoreLevel {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("«Î ‰»Î≥…º®£∫");
		int score = a.nextInt();
		if(score<0 || score>100){
			System.out.println("nonono");
		}else if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=60){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
	}
}

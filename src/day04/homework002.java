package day04;
import java.util.Scanner;

public class homework002 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		for(int i=1;i<8;i++){
			input = s.nextInt();
			if(input>0&&input<=50){
				while(input!=0){
					System.out.print("*");
					input -= 1;
				}
				System.out.println();
			}else{
				System.out.println("���벻�԰�");
			}
		}
		System.out.println("�ߴν�������");
	}
}

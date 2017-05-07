package day05;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i = 1;i<=7;i++){
			int a = s.nextInt();
			for(int k=a;k>0;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("over");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int a,b,c;
		for(int j=1;j<=4;j++){
			a = j;
			for(int k =1;k<=4;k++){
				if(k!=j){
					b = k;
					for(int l = 1;l<=4;l++){
						if(l!=j&&j!=k){
							c = l;
							System.out.println(""+a+b+c);
						}
					}
				}
			}
		}*/
	}
}

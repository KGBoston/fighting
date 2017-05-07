package day03;

import java.util.Scanner;

public class BiggerSmaller {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a,b,c;
		System.out.print("x=");
		int x = i.nextInt();
		System.out.print("y=");
		int y = i.nextInt();
		System.out.print("z=");
		int z = i.nextInt();
		if(x<y){
			if(y<z){
				c = z;
				b = y;
				a = x;
			}else{
				if(x>z){
					c = y;
					b = x;
					a = z;
				}else{
					c = y;
					b = z;
					a = x;
				}
			}
		}else{//x>y
			if(y>z){
				c = x;
				b = y;
				a = z;
			}else{//x>y&&z>y
				if(x>z){
					a = y;
					b = z;
					c = x;
				}else{
					a = y;
					b = x;
					c = z;
				}
				
			}
		}
		System.out.println(a+"<"+b+"<"+c);
	}
}

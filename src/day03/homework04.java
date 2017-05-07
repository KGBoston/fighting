package day03;

import java.util.Scanner;

public class homework04 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("输入三个整数abc（空格空开）：");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		System.out.println("输入a="+a+",b="+b+",c="+c);
		int a1=a,b1=b,c1=c;
		if(a<b&&a<c){
			b = b1<c1 ? b1:c1;
			c = b1<c1 ? c1:b1;
		}else if(a>b&&a>c){
			c = a1;
			a = b1>c1 ? c1:b1;
			b = b1>c1 ? b1:c1;
		}else{
			b = a1;
			a = b1>c1 ? c1:b1;
			c = b1>c1 ? b1:c1;
		}
		System.out.println("重新排序");
		System.out.println("a="+a+",b="+b+",c="+c);
	}
}

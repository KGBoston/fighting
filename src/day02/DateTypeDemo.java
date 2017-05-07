package day02;
import java.util.Scanner;

public class DateTypeDemo {

	public static void main(String[] args) {
		Scanner haha = new Scanner(System.in);
		int a = 25;
		long b = a;
		int c = (int)b;
		
		long d = 10000000000L;
		int e = (int)d;
		System.out.println(e);
		double f = 56.987;
		int g = (int)f;
		System.out.println(g);
		
		byte b1 = 5;
		byte b2 = 6;
		byte b3 = (byte)(b1+b2);
		System.out.println(2+2);
		System.out.println('2'+'2');
		
		
		/*
		boolean b1 = true;
		boolean b2 = false;
		char c1 = 'ÄÐ';
		char c2 = 'm';
		char c3 = '5';
		char c4 = ' ';
		char c7 = 65;
		System.out.println(c7);
		char c8 = '\'';
		System.out.println(c8);
		
		*/
		
		/*
		int a = 25;
		System.out.println(5/3);
		int c = 2147483647;
		c = c + 1;
		System.out.println(c);
		long d = 10000000000L;
		long e = 1000000000*2*10L;
		System.out.println(e);
		long f = 1000000000*3*10L;
		System.out.println(f);
		long g = 1000000000L*3*10L;
		System.out.println(g);
		long h = System.currentTimeMillis();
		System.out.println(h);
		
		double i = 3.14;
		double j = 6.0,k = 4.9;
		System.out.println(j-k);
		*/
	}

}

package day04;

public class WhileDemo {
	public static void main(String[] args) {
		int a = 0;
		while(a<10){
			System.out.println("aiyouwei");
			a++;
		}
		
		int b = 1;
		while(b<10){
			int ans = b*9;
			System.out.println(b+"*9="+ans);
			b+=2;
		}
	}
}

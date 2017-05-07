package day04;

public class ChengFa99 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int a=1;a<=i;a++){
				int ans = a*i;
				System.out.print(a+"*"+i+"="+ans+" ");
			}
			System.out.println();
		}
	}
}

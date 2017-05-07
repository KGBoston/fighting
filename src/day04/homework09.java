package day04;

public class homework09 {
	public static void main(String[] args) {
		long a = 9;
		long sum = 0;
		for(int i=1;i<=10;i++){
			System.out.print(a);
			sum += a;
			a = a*10+9;
			if(i<10){
				System.out.print("+");
			}else{
				System.out.print("=");
			}
		}
		System.out.print(sum);
		System.out.println();
		System.out.println();
		double a2 = 1;
		double sum2 = 0;
		for(int i=1;i<=15;i++){
			if(i==1){
				System.out.print(1);
			}else{
				System.out.print(1+"/"+i);
			}
			sum2 += a2;
			a2 = 1/(double)(i+1);
			if(i<15){
				System.out.print("+");
			}else{
				System.out.print("=");
			}
		}
		System.out.print(sum2);
	}
}

package day05;
import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int j,k;
		double t1 = System.currentTimeMillis();
		int[] a = new int[800];
		for(int i=0;i<800;i++){
			a[i] = (int)(Math.random()*5000+1);
		}
		System.out.println("√∞≈›«∞"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("≈≈–Ú∫Û"+Arrays.toString(a));
		double t2 = System.currentTimeMillis();
		double t = t2 - t1;
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int j,k;
		double t1 = System.currentTimeMillis();
		int[] a = new int[800];
		for(int i=0;i<800;i++){
			a[i] = (int)(Math.random()*5000+1);
		}
		System.out.println("√∞≈›«∞"+Arrays.toString(a));
		for(j=1;j<=a.length-1;j++){
			for(k=1;k<=a.length-1-j;k++){
				if(a[k-1]>a[k]){
					int l = a[k-1];
					a[k-1] = a[k];
					a[k] = l;
				}
			}
			System.out.println("√∞≈›÷–"+Arrays.toString(a)+j+ " "+k);
		}
		System.out.println("≈≈–Ú∫Û"+Arrays.toString(a));
		double t2 = System.currentTimeMillis();
		double t = t2 - t1;
		System.out.println(t);
		*/
	}
}

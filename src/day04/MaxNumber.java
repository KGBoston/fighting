package day04;
import java.util.Arrays;

public class MaxNumber {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int[] a = new int[1000];
		for(int i=0;i<1000;i++){Arrays.sort(a);
			a[i] = (int)(Math.random()*10000+1);
		}
		System.out.println("排序前："+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++){
			for(int p=0;p<a.length-i-1;p++){
				if(a[p] > a[p+1]){
					int m = a[p];
					a[p] = a[p+1];
					a[p+1] = m;	
				}
			}
			System.out.println("冒泡中："+Arrays.toString(a));
		}
		System.out.println("冒泡后："+Arrays.toString(a));
		long t2 = System.currentTimeMillis();
		long t = t2-t1;
		System.out.println("用时"+t+"毫秒");
		
		
	}	
}		
		
		
		
		
		
		
		
		
		/*
		long t1 = System.currentTimeMillis();
		Random ran = new Random();
		int[] a = new int[100];
		for(int i=0;i<100;i++){
			a[i] = ran.nextInt(1000);
		}
		System.out.println(Arrays.toString(a));
		System.out.println("开始冒泡");
		for(int m=1;m<a.length;m++){
			for(int n=1;n<a.length;n++){
				if(a[n-1]>a[n]){
					int ha = a[n-1];
					a[n-1] = a[n];
					a[n] = ha;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		long t2 = System.currentTimeMillis();
		long t = t2-t1;
		System.out.println("用时"+t+"毫秒");
	}
}
*/
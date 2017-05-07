package day04;
public class homework001 {
	public static void main(String[] args) {
		int a,b,c;
		for(int i=1;i<=4;i++){
			a=i;
			for(int j=1;j<=4;j++){
				if(j!=i){
					b = j;
					for(int k =1;k<=4;k++){
						if(k!=j&&k!=i){
							c = k;
							System.out.println(""+a+b+c);
						}
					}
				}
			}
		}
	}
}

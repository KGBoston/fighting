package day05;

public class Demo01 {
	public static void main(String[] args) {
		//互联网传输都是byte int传输都是拆开4份 int32位就是这么来的
		/*
		 * n = 01010101 11110000 01010101 11011111
		 * m = 00000000 00000000 00000000 11111111    mask 掩码
		 * 传输时先&运算 然后n>>>8 切第二段                         （>>>）逻辑右移运算
		 */
			String i = "10";
			int a = Integer.parseInt(i);//字符串转int
			System.out.println(Integer.toBinaryString(a));//int转2进制
			
			System.out.println(a);
			//println底层调用 Integer.toString然后print
			
			//16进制   0x开头    16进制用来表示缩写2进制
			System.out.println(Integer.toHexString(a));
			System.out.println(Integer.toOctalString(a));
			
			for(long p = -50;p<=50;p++){
				System.out.println(Long.toBinaryString(p));
			}
			//double float IEEE754规则
			int k = 0x80000000;
			System.out.println(Integer.toBinaryString(k));
			System.out.println(k);
			System.out.println(k-1);
			System.out.println(Integer.toBinaryString(k-1));
	}
}

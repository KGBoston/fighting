package day05;

public class Demo02 {
	public static void main(String[] args) {
		//互联网传输都是byte int传输都是拆开4份 int32位就是这么来的
		/*
		 * n = 01010101 11110000 01010101 11011111
		 * m = 00000000 00000000 00000000 11111111    mask 掩码
		 * 传输时先&运算 然后n>>>8 切第二段                         （>>>）逻辑右移运算
		 */
		//int数据传输   (用移位运算和掩码运算)
		/*
		 * >>数学右移 负数 如果高位1 补1
		 * >>>逻辑右移 纯移位
		 */
		
		int a = 555555555;
		int b = 0xff;   //掩码
		for(int i = 1;i<=4;i++){
			System.out.println(Integer.toBinaryString(a&b));
			a = a>>>8;
		}
	}
}

package day05;

public class Demo01 {
	public static void main(String[] args) {
		//���������䶼��byte int���䶼�ǲ�4�� int32λ������ô����
		/*
		 * n = 01010101 11110000 01010101 11011111
		 * m = 00000000 00000000 00000000 11111111    mask ����
		 * ����ʱ��&���� Ȼ��n>>>8 �еڶ���                         ��>>>���߼���������
		 */
			String i = "10";
			int a = Integer.parseInt(i);//�ַ���תint
			System.out.println(Integer.toBinaryString(a));//intת2����
			
			System.out.println(a);
			//println�ײ���� Integer.toStringȻ��print
			
			//16����   0x��ͷ    16����������ʾ��д2����
			System.out.println(Integer.toHexString(a));
			System.out.println(Integer.toOctalString(a));
			
			for(long p = -50;p<=50;p++){
				System.out.println(Long.toBinaryString(p));
			}
			//double float IEEE754����
			int k = 0x80000000;
			System.out.println(Integer.toBinaryString(k));
			System.out.println(k);
			System.out.println(k-1);
			System.out.println(Integer.toBinaryString(k-1));
	}
}

package day05;

public class Demo02 {
	public static void main(String[] args) {
		//���������䶼��byte int���䶼�ǲ�4�� int32λ������ô����
		/*
		 * n = 01010101 11110000 01010101 11011111
		 * m = 00000000 00000000 00000000 11111111    mask ����
		 * ����ʱ��&���� Ȼ��n>>>8 �еڶ���                         ��>>>���߼���������
		 */
		//int���ݴ���   (����λ�������������)
		/*
		 * >>��ѧ���� ���� �����λ1 ��1
		 * >>>�߼����� ����λ
		 */
		
		int a = 555555555;
		int b = 0xff;   //����
		for(int i = 1;i<=4;i++){
			System.out.println(Integer.toBinaryString(a&b));
			a = a>>>8;
		}
	}
}

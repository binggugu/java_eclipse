package javastudy;

public class Op1 {

	public static void main(String[] args) {
		// ���� ����
		int remaider = 29%2; //����Ÿ�� ������ = ��
		System.out.println("��������" + remaider + "��");
		
		//�񱳿�����
		
		int x=1, y=1;
		boolean z; // true or false �� ������� ������
		z= ((x<1) || (--y<1)); //0 <1 or y<1 //���� �ϳ��� ture�ϰ�� ture
		System.out.println("����� : " + z);
		z= ((x<1) && (y--<1)); // �Ѵ� ������ �ؾ� ture
		System.out.println("����� : " + z); 
		
		//���Կ�����
		int value=2;
		value /= 2; // value = value-2;
		System.out.println("���"+value);
		
		
		value <<=6; // value ���� <<�� ����?
		System.out.println("��"+value);
		
		
		//��ȣ ������
		x=2;
		y=1;
		System.out.println("x="+ ++x +" x++="+ x++); //x=x+1 //x++
		System.out.println("x="+ x +" --x="+ --x); //x--(x=x-1)
		System.out.println("y="+ y +" y++="+ y++); 
		System.out.println("y="+ y +" --y="+ --y);
		
		//���ǿ�����
		x=3;
		y=(x==1)? 10 : 20; //����? ���϶� ��; �����϶� ��;
		System.out.println("����� : "+ y);
		
		
		
	}

}

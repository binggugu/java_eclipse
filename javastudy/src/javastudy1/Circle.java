package javastudy1;

public class Circle {
	public int radius; //�ʵ�(=�������)  public�� ���൵ �ǰ� �Ƚ��൵ ��.
	public String name; //�ʵ�
	// �ʵ� : circleŬ������ ������ Ư¡
	//==>�� �ʵ带 �̿��ؼ� �޼ҵ忡�� �۾�(���Һο�)
	
	//�޼��� => ���Һο�
	//������ ����Ÿ�� �޼����̸�(.. ) {}
	public double getArea() {
		return 3.14 * radius * radius;	 	// return = ����� �Է� �ޱ����ؼ�
		// 3.14 * this.radius * this.radius
		// 3.14 * Circle.radius * Circle.radius
	}
	
	//�⺻������ ==> Ŭ���� �̸�
	//������ Ŭ���� �̸�()...
	public Circle(){
	}
	
	//�Ű������� �ִ� ������
	public Circle(int r, String n){
		radius = r; //Ŭ���� �ʵ� = ���޵Ǵ°�
		name = n;
	}
	
	public static void main(String[] args) {
	//Circle Ŭ������ �ִ� ������ �޼��带 ������ ������..
	Circle pizza; // Ŭ������ ������
	pizza = new Circle(); // ��üƲ���� �� ����ϱ� (�ν��Ͻ�)
	
	pizza.radius = 10;
	pizza.name = "�ڹ�����"; //��ü��.�ʵ�(����)=��
	double area = pizza.getArea(); //���� = ��ü.�޼���()
	System.out.println(pizza.name + "�� ������ " + area);
	
	Circle dount = new Circle(); //�ν��Ͻ�ȭ
	dount.radius = 2;
	dount.name = "�ڹٵ���";
	area = dount.getArea();
	System.out.println(dount.name+"�� ������ "+area);
	
	//circle --> rectangle�� �����ؼ� ���
	Rectangle rect = new Rectangle(); //��ü �ν��Ͻ�ȭ
	rect.width = 40;
	rect.height = 100;
	int area1 = rect.getArea();
	System.out.println("�簢���� ���̴� "+area1);
	
	// �Ű������� �ִ� �����ڸ� ���� ��ü ����
	Circle test = new Circle(10, "�ڱ��̸�");
	area = test.getArea();
	System.out.println(test.name + "������ "+area);
	
	//Rectangle Ŭ������ �Ű����� ������ �����
	//��ü ���� �ϳ� �ϱ�
	
	Rectangle rect1 = new Rectangle(10,30);
	int area2 = rect1.getArea();
	System.out.println("�簢���� ���̴�2 " + area2);
	
	//Circle�� Book ��ü ����
	Book javabook = new Book("java","�ڱ��̸�");
	Book bible = new Book ("bible");
	Book emptyBook = new Book();
	bible.show();
	javabook.show();
	emptyBook.show();
	
	
	}
}









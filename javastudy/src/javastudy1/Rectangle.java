package javastudy1;

public class Rectangle {
	int width; // �ʵ� ==> �����ϸ� default
	int height; 
	int getArea() {
		return width * height;
	}
	//�⺻������
	public Rectangle(){
	}
	
	public Rectangle(int w, int h){
		this.width = w;			// this ????????? ���൵ �ǰ� �Ƚ��൵ �ȴ�.
		height = h;
	};

}

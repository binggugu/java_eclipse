package javastudy1;

public class Rectangle {
	int width; // 필드 ==> 생략하면 default
	int height; 
	int getArea() {
		return width * height;
	}
	//기본생성자
	public Rectangle(){
	}
	
	public Rectangle(int w, int h){
		this.width = w;			// this ????????? 써줘도 되고 안써줘도 된다.
		height = h;
	};

}

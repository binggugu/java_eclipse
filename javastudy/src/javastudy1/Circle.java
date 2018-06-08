package javastudy1;

public class Circle {
	public int radius; //필드(=멤버변수)  public은 써줘도 되고 안써줘도 됨.
	public String name; //필드
	// 필드 : circle클래스가 가지는 특징
	//==>이 필드를 이용해서 메소드에서 작업(역할부여)
	
	//메서드 => 역할부여
	//접근자 리턴타입 메서드이름(.. ) {}
	public double getArea() {
		return 3.14 * radius * radius;	 	// return = 출력을 입력 받기위해서
		// 3.14 * this.radius * this.radius
		// 3.14 * Circle.radius * Circle.radius
	}
	
	//기본생성자 ==> 클래스 이름
	//접근자 클래스 이름()...
	public Circle(){
	}
	
	//매개변수가 있는 생성자
	public Circle(int r, String n){
		radius = r; //클래스 필드 = 전달되는값
		name = n;
	}
	
	public static void main(String[] args) {
	//Circle 클래스에 있는 변수와 메서드를 가져와 쓰려면..
	Circle pizza; // 클래스면 변수명
	pizza = new Circle(); // 객체틀에서 찍어서 사용하기 (인스턴스)
	
	pizza.radius = 10;
	pizza.name = "자바피자"; //객체명.필드(변수)=값
	double area = pizza.getArea(); //변수 = 객체.메서드()
	System.out.println(pizza.name + "의 면적은 " + area);
	
	Circle dount = new Circle(); //인스턴스화
	dount.radius = 2;
	dount.name = "자바도넛";
	area = dount.getArea();
	System.out.println(dount.name+"의 면적은 "+area);
	
	//circle --> rectangle을 주입해서 사용
	Rectangle rect = new Rectangle(); //객체 인스턴스화
	rect.width = 40;
	rect.height = 100;
	int area1 = rect.getArea();
	System.out.println("사각형의 넓이는 "+area1);
	
	// 매개변수가 있는 생성자를 통해 객체 생성
	Circle test = new Circle(10, "자기이름");
	area = test.getArea();
	System.out.println(test.name + "면적은 "+area);
	
	//Rectangle 클래스에 매개변수 생성자 만들기
	//객체 생성 하나 하기
	
	Rectangle rect1 = new Rectangle(10,30);
	int area2 = rect1.getArea();
	System.out.println("사각형의 넓이는2 " + area2);
	
	//Circle에 Book 객체 조립
	Book javabook = new Book("java","자기이름");
	Book bible = new Book ("bible");
	Book emptyBook = new Book();
	bible.show();
	javabook.show();
	emptyBook.show();
	
	
	}
}










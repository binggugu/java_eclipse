package javastudy1;

public class Book {
	String title;
	String author;
	
	public void show(){
		System.out.println(title + "" + author);
	}
	//생성자
	public Book(){
		this("",""); //Book(String, string);생성자 호출 //기본으로 써줘야한다. 순서변경 X
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title){
		this(title, "작자미상");
	}
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
}

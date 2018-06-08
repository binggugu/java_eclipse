import java.util.Scanner;

public class ScannerEx {
 public static void main(String[] args){

     //객체 생성
     //클래스 변수 = new 클래스 () ;
     System.out.println("숫자를 두개 입력>>");
     Scanner in = new Scanner(System.in);
     int x= in.nextInt(); //객체사용법 : 객체변수명.메소드();
     int y= in.nextInt();

     System.out.printf("%d * %d은 %d입니다.", x, y, x*y);

     System.out.println("이름과 나이를 입력하세요");
     String name = in.next();
     int age=in.nextInt();
     System.out.println("당신의 이름은"+name+"나이는"+age+"입니다.");
//문제 : 직사각형의 가로 세로 값을 입력받아서 넓이를 구하세요.

     System.out.println("직사각형의 값을 구하세요");
     int 가로 = in.nextInt();
     int 세로 = in.nextInt();

     System.out.printf("%d * %d은 %d입니다 ", 가로, 세로, 가로*세로 );


     System.out.print("직사각형의 값을 구하세요");
 }

}


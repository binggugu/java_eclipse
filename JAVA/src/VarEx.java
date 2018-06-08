public class VarEx {

    public static void main(String[] args) {

        int mach;
        int distance;
        mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리 :" + distance + "m");

        double radius;
        double area;
        final double PI=3.141592;
        radius = 10.0;
        area = radius * radius * PI;
        System.out.println("반지름이" + radius + "인 원의 넓이:" + area);

        radius=100.0;
        area = radius * radius * PI;
        System.out.println("반지름이" + radius + "인 원의 넓이:" + area);


//문자, 논리
        char ga1 = '가';
        char ga2 = '\uac00';
        String str = "hello";
        boolean cham = true;

        System.out.println("문자출력" + ga1 + ga2);
        System.out.println("논리" + cham);

        int i;
        double d;
        double d1;

        i = 7 / 4;
        System.out.println(i);
        d = 7 / (double) 4;
        d1 = 7/4.0;
        System.out.println("출력결과 :" + d + d1);
        double d2 = 1.999999;
        int j = (int) d2;
        System.out.println(j);
        byte b = (byte) 300;
        System.out.println(b);

    }
}


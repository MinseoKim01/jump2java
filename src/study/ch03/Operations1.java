package study.ch03;

public class Operations1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 증감 연산
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        // 증감 연산의 위치에 따른 차이
        int c = 10;
        System.out.println(c++); // 10 (값을 참조한 후 증가)
        System.out.println(c);   // 11
        System.out.println(++c); // 12 (값을 참조하기 전 증가)
    }
}

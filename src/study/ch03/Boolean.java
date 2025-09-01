package study.ch03;

public class Boolean {
    // String[]은 문자열 배열 ...
    public static void main(String[] args) {
        boolean isCorrect = false;
        isCorrect = 2 > 1;
        System.out.println(isCorrect);

        // Integer.parseInt() 문자열 배열 중 첫번내 인자 지정 > int 변환
        int yours = Integer.parseInt(args[0]);
        int height = 185;
        boolean isTall = height < yours;

        if (isTall) {
            System.out.println("185보다 키가 큽니다.");
        }
    }
}
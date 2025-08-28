import java.util.Arrays;

public class Sample {
    // 입력 자료형 String[] args : 문자열 배열 자료형 인수이름(argument)
    public static void main(String[] args) {
        // 데이터 표준 출력하는 명령문, 명령문은 반드시 세미콜론(;)을 붙여야함
        System.out.println("Hello java" + Arrays.toString(args));
    }
}
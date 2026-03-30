package kr.ac.oop;

public class EX19 {
    public static void main(String[] args) {
        // 문자열?
        int a = 10;
        // 최초로 자바에서 만들어 놓은 클래스를 사용해보는것
        //String str=new String("홍길동");
        //          012345~~index
        String str = "APPLE";
        // 문자열의 길이를 구하여 출력하시오. (5)
        System.out.println(str.length());
        // 모든 문자열을 소문자로 변경해서 출력하시오.
        System.out.println(str.toLowerCase()); // apple
        // 문자열 중에서 L이라는 문자 한개만 출력하시오.
        System.out.println(str.charAt(3)); // 'L'
        // APPLE에서 부분문자열 "PL"만 출력하시오.
        System.out.println(str.substring(2, 4)); // PL
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
 }


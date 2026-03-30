package kr.ac.oop;

public class EX02 {
    public static void main(String[] args) {
        // 문자 2개를 저장할 [변수를 선언] 하시오. = [**아스키코드표참고**]
        char a,b;
        // 각각 '1' 과 '2'를 저장하시오.
        a='1'; // 49-'0'=1
        b='2'; // 50-'0'=2
        // 두 변수의 값을 더하여 3을 출력하시오.
        System.out.println(a-'0'+b-'0'); // 49(-48)+50(-48)=3
        // Q.문자 A(65)를 소문자(a=97)로 출력하시오. = 32
        char lower='A';   // 'A'+32=97(a)
        System.out.println((char)(lower+32)); // (char)97 = a
    }
}

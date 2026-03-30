package kr.ac.oop;

public class EX07 {
    public static void main(String[] args) {
        // Q. [문자 배열]에 'a','p','p','l','e'
        // apple문자를 저장하고 출력할때는
        // APPLE로 출력하시오.
        char[] arr=new char[5]; // 1차원 배엻
        arr[0]='a';
        arr[1]='p';
        arr[2]='p';
        arr[3]='l';
        arr[4]='e';
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)(arr[i]-32)); // APPLE
        }
    }
}
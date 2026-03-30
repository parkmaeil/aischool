package kr.ac.oop;

import kr.ac.util.MyPrint;

public class EX12 {
    public static void main(String[] args) {
        // kr.ac.util에 MyPrint 클래스를 만드시오.
        // s~e까지의 알파벳을 출력하는 alpaPrint(char s, char e) 메서드를 만들어서
        // 알파벳을출력하시오.
        char s='A';
        char e='Z';
        MyPrint my=new MyPrint();
        my.alpaPrint(s,e);
    }
}

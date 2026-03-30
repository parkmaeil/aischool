package kr.ac.oop;
public class EX03 {
    public static void main(String[] args) {
        // 정수(int) 1개를 선언하고 7을 저장하세요.
        int a=10;
        // Q. [짝수인지 홀수]인지 판단(if)하여 출력하시오.
        //int mod=a%2; // ?
        if(a%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
        // Q. 어떤 수가 3의 배수인지 판단하시오.
        int b=21;
        if(b%3==0){
            System.out.println("3의 배수");
        }else{
            System.out.println("3의 배수 아님");
        }
        // Q. 어떤 수가 2의 배수이고 3의 배수인지 판단하시오?
        int c=12; // if(c%2==0 && c%3==0) yes
        if(c%2==0 && c%3==0) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

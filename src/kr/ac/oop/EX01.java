package kr.ac.oop;
public class EX01 {
    public static void main(String[] args) {
        // Q. 정수 2개를 저장할 [변수를 선언]하시오?
        int a, b;
        // 10과 20을 변수에 저장하시오.
        a=10;
        b=20;
        // 변수의 값을 더하여 sum이라는 변수에 저장하시오?
        int sum=a+b;
        // 총합을 출력하시오.
        System.out.println("sum="+sum);
        // [실수] 2개를 저장할 [변수를 선언]하고 [15.6f, 34.5f]를 저장하시오.
        float c=15.6f;
        float d=34.5f;
        // c, d의 변수의 값을 서로 [교환]하시오.
        float temp=c;
        c=d;
        d=temp;
        // c, d의 값을 출력하시오.
        System.out.println("c="+c);
        System.out.println("d="+d);
        // c=34.5
        // d=15.6
    }
}

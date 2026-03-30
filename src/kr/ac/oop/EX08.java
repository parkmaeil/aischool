package kr.ac.oop;
public class EX08 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // a+b=30 -> 계산
        // 메서드 호출(Call)
        int sum=hap(a,b);
        System.out.println(sum);
    }
    // Q. 두개의 정수를 매개변수로 받아서 총합을 구하여 출력하는
    // 메서드를 정의하시오.
    public static int hap(int a,int b){
        int sum=a+b; // 총합
        //System.out.println(sum); // 30
        return sum;
    }
}

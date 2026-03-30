package kr.ac.oop;
public class EX09 {
    public static void main(String[] args) {
        float a=11.11f;
        float b=22.22f;
        // a+b=? 메서드를 호출(Call) 33.33....
        float sum=floatHap(a,b);
        System.out.println(sum); // 33.329998
    }
    // Q. 매개변수로 두개의 실수값을 받아서 총합을 구하여 리턴하는 [메서드를 정의]하시오.
    // floatHap(){    }
    public static float floatHap(float a, float b){
        float sum=a+b;
        return sum;
    }
}

package kr.ac.oop;
public class EX10 {
    public static void main(String[] args) {
        int a=1;
        int b=100;
        // a~b까지의 총합=55
        int sum=startEndHap(a,b);
        System.out.println(sum);
    }
    // Q. 매개변수로 두수를 받아서 [두수 사이의 총합]을 구하여 리턴하는
    // [메서드를 정의]하시오. startEndHap(){   }
    public static int startEndHap(int a, int b){
       int sum=0;
       for(int i=a;i<=b;i++){
           sum+=i; // sum=sum+i;
       }
       return sum;
    }
}

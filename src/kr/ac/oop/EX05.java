package kr.ac.oop;

public class EX05 {
    public static void main(String[] args) {
       // Q. 정수 3개를 저장할 [배열을 생성]하시오.
        int[] arr=new int[3]; // 데이터를 묶어서->이동
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        // 배열과 반복문을 함게 사용하면 효율적으로 데이터를 조작할수있다.
        int sum=0;
        for(int i=0;i<arr.length;i++) {
           sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

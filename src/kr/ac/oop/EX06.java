package kr.ac.oop;

public class EX06 {
    public static void main(String[] args) {
        // Q 실수 3개를 저장할 [배열을 생성]하고
        // 실수 3개를 [배열에 저장]을 한후 [총합]을 구하여 출력하시오.
        // 11.3f, 34,56f, 67,21f
        float[] arr=new float[3];
        arr[0]=11.3f;
        arr[1]=34.56f;
        arr[2]=67.21f;
        float sum=0.0f;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum); // 113.07
    }
}

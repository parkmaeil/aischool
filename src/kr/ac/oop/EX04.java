package kr.ac.oop;

public class EX04 {
    public static void main(String[] args) {
        // Q. 1~10까지의 수중 짝수만 출력하시오.
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }//
        }//
        // Q. 1~10까지의 수중 홀수만 출력하세요.(while)
        int j=1;
        while(j<=10){
            if(j%2!=0){
                System.out.println(j);
            }
            j++;
        }
    }
}

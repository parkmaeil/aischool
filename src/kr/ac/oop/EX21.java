package kr.ac.oop;

public class EX21 {
    public static void main(String[] args) {
        String str1 = "111";
        String str2 = "222";
        // str1+str2=333
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(sum); // 333
        // Q. 문자열="1#2#3#4#5" 를 #을 기준으로 분리하여 1+2+3+4+5=15를 출력하시오.
        String su="1#2#3#4#5"; //"1"->1
        String[] sp=su.split("#");
        int hap=0;
        for(String data : sp){
            hap=hap+Integer.parseInt(data);
        }
        System.out.println(hap); //15
    }
}

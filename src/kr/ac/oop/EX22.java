package kr.ac.oop;
public class EX22 {
    public static void main(String[] args) {
        // 문자열 비교
        String str1="APPLE";
        String str2="BANANA";
        // str1과 str2가 같은지 다른지?
        if(str1.equals(str2)){
            System.out.println("EQ");
        }else{
            System.out.println("Not-EQ"); //
        }
        // 크다, 작다 ? = 정렬
        //int cmp=str1.compareTo(str2); // 양수, 음수, zero(O)
        if(str1.compareTo(str2)>0){
            System.out.println("str1>str2");
        }else{
            System.out.println("str1<str2"); //O
        }
    }
}

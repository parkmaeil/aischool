package kr.ac.oop;

public class EX20 {
    public static void main(String[] args) {
        // 문자열을 분리
        String str="사과#오랜지#포도#귤"; // 중요
        String[] sp=str.split("#"); // 정규표현식
        for(String fd:sp){ // 향상된 for => for~each 문
            System.out.println(fd);
        }
        for(int i=0;i<sp.length;i++){ // 정규 for`
            System.out.println(sp[i]);
        }
    }
}

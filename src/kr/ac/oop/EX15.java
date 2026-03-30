package kr.ac.oop;

import kr.ac.model.Movie;

public class EX15 {
    public static void main(String[] args) {
        // Q. 영화 한편을 저장하고 출력하는 프로그램을 작성하시오.
        // 영화(Movie) : 제목, 주인공, 금액, 개봉일, 등급(12)
        Movie m=new Movie("왕사 남","홍길동",20000,"2026-03-03",12);
        System.out.println(m);
        Movie m1=new Movie("왕사 남","홍길동",20000,"2026-03-03",12);
        System.out.println(m1);
    }
}

package kr.ac.oop;
import kr.ac.model.Book;
public class EX14 {
    public static void main(String[] args) {
       // [생성자 메서드]를 이용하여 객체를 초기화 한다.(값을 설정)
       Book book=new Book("자바","이지스퍼블리싱","홍길동",35000,"ISBN12345", 500);
       System.out.println(book);
    }
}

package kr.ac.oop;

import kr.ac.model.Book;

public class EX13 {
    public static void main(String[] args) {

        // Q. [정수] 한개를 저장할 [변수를 선언]하시오?
        int a;
        a=10;
        // Q. [책] 한권을 저장할 [변수를 선언]하시오?
        Book book=new Book();
        book.setTitle("자바");
        book.setPublisher("이지스퍼블리싱");
        book.setAuthor("홍길동");
        book.setPrice(35000);
        book.setIsbn("ISBN12345");
        book.setPage(500);
        // sout
        System.out.println(book.getTitle()+"\t"+book.getPublisher()+"\t"+book.getAuthor()+"\t"+book.getPrice()+"\t"+book.getIsbn()+"\t"+book.getPage());
        System.out.println(book);// book.toString()
    }
}

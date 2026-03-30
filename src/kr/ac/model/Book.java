package kr.ac.model;
//책(Object) => [제목, 출판사, 저자, 가격, ISBN, 페이지수] ->모델링
// class=>객체 모델링(설계)하는 도구
public class Book {
   // 1. 모든 멤버변수를 정보은닉(private)
   private String title;
   private String publisher;
   private String author;
   private int price;
   private String isbn;
   private int page;
   // 2. 디폴트생성자 메서드를 만들어주자.
   public Book(){     }
   // 3. 오버로딩 생성자메서드는 필요할때 만들어서 사용하자.
   public Book(String title, String publisher, String author, int price, String isbn, int page) {
      this.title = title;
      this.publisher = publisher;
      this.author = author;
      this.price = price;
      this.isbn = isbn;
      this.page = page;
   }

   // 4. setter, getter method - 12개
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getIsbn() {
      return isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   public int getPage() {
      return page;
   }

   public void setPage(int page) {
      this.page = page;
   }
   // 5. toString() method => 객체가 가지고 있는 모든 맴버변수의 값을 문자열로 만들어서 리턴해주는 메서드
   @Override
   public String toString() {
      return "Book{" +
              "title='" + title + '\'' +
              ", publisher='" + publisher + '\'' +
              ", author='" + author + '\'' +
              ", price=" + price +
              ", isbn='" + isbn + '\'' +
              ", page=" + page +
              '}';
   }
}

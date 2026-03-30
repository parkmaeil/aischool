package kr.ac.oop;
import kr.ac.util.MyHap;
public class EX11 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // MyHap이라는 클래스를 사용하기 위해서 MyHap클래스를 메모리에 올려야한다.
        // 객체생성=>new MyHap()
        MyHap my=new MyHap(); // MyHap() : 생성자메서드
        int sum=my.calcHap(a,b);
        System.out.println(sum);
    }
}

// 시작클래스(객체)- main() 기능(function=함수=메서드:method)
public class Start {
    public static void main(String[] args) {
      // 1+1=2
      // 1. 변수 = 메모리 기억공간의 이름(Symbol)
      // 2. 자료형(DataType) : 변수의 크기와 저장할 데이터의 종류
      //    를 결정하는 것
      //    - 기본자료형(PDT) : int(4byte+정수), float(4byte+실수)
      // 3. 변수선언 : 메모리에 실제 변수를 만드는 행위
      // Q : 정수 1개를 메모리에 저장할 [변수를 선언]하시오?
        int a;
      // 4. 대입(=) : 변수에 데이터를 저장하는 것
        a=10;
      // 5. 출력
        System.out.println(a);
      // Q. 실수 1개를 저장할 [변수를 선언]하시오?
       float b;
       // b에 3.14 실수값을 저장
       b=3.14f;
       // b의 값을 출력
       System.out.println(b);
       // 문자 1개를 저장할 [변수를 선언]하시오?
       char c='박'; // 선언+초기화
       System.out.println(c);
       // 참이라는 불값을 저장하기 위한 [변수를 선언]하시오.
       boolean t=true;
       System.out.println(t);
    }
}

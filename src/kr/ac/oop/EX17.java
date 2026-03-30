package kr.ac.oop;

import kr.ac.util.Location;

public class EX17 {
    public static void main(String[] args) {
        // Q. 맛집 위치정보를 저장하고 출력하시오.
        //                                   double
        // 맛집(Location) : 번호(1), 맛집이름, 위도, 경도, 전화, 주소 - (3곳)
        Location[] locations=new Location[3];
        locations[0]=new Location(1, "A",111.11, 222.22,"010-1111-1111","광주");
        locations[1]=new Location(2, "B",333.11, 444.22,"010-2222-1111","전북");
        locations[2]=new Location(3, "C",555.11, 666.22,"010-3333-1111","서울");

        for (int i = 0; i < locations.length; i++) {
            System.out.println(locations[i].toString());
        }
        // 향상된 for
        for( Location loc : locations){
            System.out.println(loc); // loc.toString()
        }
    }
}
/*
   class = Model(역할) - 개발자가 만들수있는 모델(클래스)의 종류
   1. DTO(Data Transfer Object) : Location, Student
   2. DAO(Data Access Object) : DataBase를 연결하여 CRUD를 수행하는 객체
   3. Utility(Helper) Object : MyHap
 */

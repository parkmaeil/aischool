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
            System.out.println(locations[i]);
        }
    }
}

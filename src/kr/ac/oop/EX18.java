package kr.ac.oop;

import kr.ac.util.Location;

public class EX18 {
    public static void main(String[] args) {
        // 맛집 데이터가 있다.
        int id=4;
        String name="고창맛집";
        double lat=1234.56;
        double lng=123.456;
        String phone="010-1111-1111";
        String address="전북";
        //print(id, name, lat, lng, phone, address);
        // 데이터를 하나의 구조로 묶는 작업
        // 1. DTO(Data Transfer Object)
        Location loc=new Location(id, name, lat, lng, phone, address);
        print(loc); //  이동(다른 메서드로 넘기는 것)
    }
    public static void print(Location loc){
        System.out.println(loc.toString());
    }
}

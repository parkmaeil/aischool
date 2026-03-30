package kr.ac.oop;

import kr.ac.model.Student;

import java.util.Arrays;

public class EX16 {
    public static void main(String[] args) {
        // Q. 학생 정보를 저장하고 출력하는 프로그램을 작성하시오.
        // 학생(Student) : 이름, 나이, 전화번호, 이메일, 생일

        Student[] students = new Student[4];
        students[0] = new Student("홍길동", 20, "010-1111-1111", "aaa@empas.com", "03/03");
        students[1] = new Student("나길동", 19, "010-2222-2222", "bbb@empas.com", "02/03");
        students[2] = new Student("조길동", 20, "010-3333-1111", "ccc@empas.com", "05/03");
        students[3] = new Student("김길동", 25, "010-4444-1111", "ddd@empas.com", "07/03");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

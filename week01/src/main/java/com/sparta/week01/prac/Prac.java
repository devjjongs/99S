package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    // public, static void 에 대해서는 곧 배웁니다! 우선은 넘어갈게요.
    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }

    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 메소드 연습퀴즈
    public static int methodQuiz(int i, int j) {
        return i - j;
    }

    public static void main(String[] args) {

        // 숫자
        System.out.println("===== 숫자형 =====");
        int a = 7;
        int b = 3;
        float c = 3.7f;
        Long d = 10000000000L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("==================");

        // 문자열
        System.out.println("===== 문자열 =====");
        String myName = "남병관";
        String myName2 = "홍길동";
        String myName3 = myName + " | " + myName2;
        System.out.println(myName);
        System.out.println(myName2);
        System.out.println(myName3);
        System.out.println("==================");

        // 참거짓
        System.out.println("===== 참거짓 =====");
        int myAge = 20;
        boolean isAdult = myAge > 20;
        boolean isKid = myAge <= 20;
        System.out.println(isAdult);
        System.out.println(isKid);
        System.out.println(myAge == 20);
        System.out.println(myAge != 20);
        System.out.println("==================");

        // 배열
        System.out.println("=====  배열  =====");
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 React";
        myList.add(course1);    //  문자열 추가 .add();
        myList.add(course2);
        System.out.println(myList);
        System.out.println("문자열 추출: " + myList.get(1));      //  문자열 추출 .get();
        myList.remove(1);   //  문자열 삭제 .remove();
        System.out.println("문자열 삭제: " + myList);
        System.out.println("==================");


        // 연습 퀴즈
        // 코스1 = 웹개발 종합반
        // 코스2 = 앱개발 종합반
        System.out.println("==== 연습퀴즈 ====");
        // 배열 선언
        List<String> courseList = new ArrayList<>();
        String course3 = "웹개발 종합반";
        String course4 = "앱개발 종합반";

        // 문자열 추가
        courseList.add(course3);
        courseList.add(course4);

        System.out.println(courseList);
        System.out.println("==================");

        // 메소드
        // 메소드 없을때
        System.out.println("===== 메소드 =====");
        System.out.println("1) 메소드 없을때");
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
        System.out.println("------------------");
        System.out.println("2) 메소드 있을때");
        System.out.println("'printInfo() 실행'");
        printInfo();
        System.out.println("------------------");
        System.out.println("3) 파라미터, 반환값의 다양한 경우");
        System.out.println("파라미터 X, 반환값 X");
        simplePrint();
        System.out.println("파라미터 O, 반환값 X");
        simpleSum(1, 2);
        System.out.println("파라미터 X, 반환값 O");
        int ret = simpleReturn();
        System.out.println(ret);
        System.out.println("파라미터 O, 반환값 O");
        int ret2 = sum(10, 7);
        System.out.println(ret2);
        System.out.println("------------------");
        System.out.println("*메소드명은 변수명과 규칙(영어사용, 소문자시작,");
        System.out.println(" 공백없음, 대문자구분)이 같습니다.");
        System.out.println("==================");

        // 메소드 연습퀴즈
        System.out.println("==== 연습퀴즈 ====");
        System.out.println("두 정수를 받아서 뺀 값을 반환하는 메소드를 만들고, 그 값을 인쇄해보세요:");
        int qRet = methodQuiz(90, 9);
        System.out.println("두 정수의 차: " + qRet);
        System.out.println("==================");

    }
}
//        System.out.println("===== 문자열 =====");
//        System.out.println("==================");
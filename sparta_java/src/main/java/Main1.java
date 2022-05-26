/* 기본 문법 */
////Hello World
///*
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!!");
//    }
//}*/
//
//
////변수와 상수 - 예제 1
///*public class Main {
//        public static void main(String[] args) {
//            // write your code here
//            // 변수
//            int number = 5;
//            System.out.println(number);
//
//            String sparta = "Hello Sparta";
//            System.out.println(sparta);
//
//            // 상수
//            final int finalNum = 1;
//            System.out.println(finalNum);
////            finalNum = 2;
////            System.out.println(finalNum);
//        }
//}*/
//
//
//// 참조 자료형, 배열
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        String sparta = "Hello Sparta!!";
//        System.out.println(sparta);
//
//        // 아무런 값을 할당하지 않은 5개짜리 배열 선언
//        int[] intEmptyArray = new int[5];
//        // int의 default 값 0으로 채워짐
//        System.out.println("intEmptyArray : " + Arrays.toString(intEmptyArray));
//
//        // int 배열을 선언과 동시에 초기화
//        int[] intArray = new int[]{1, 2, 3, 4, 5};
//        System.out.println("intArray : " + Arrays.toString(intArray));
//
//        System.out.println("===========================================");
//
//        // 아무런 값을 할당하지 않은 5개짜리 문자배열 선언
//        String[] stringEmptyArray = new String[5];
//        // 참조자료형은 값이 없을 경우 null(아무것도 없다) 이라는 표현으로 표시
//        System.out.println("stringEmptyArray : " + Arrays.toString(stringEmptyArray));
//
//        // String 배열을 선언과 동시에 초기화
//        String[] season = {"봄", "여름", "가을", "겨울"};
//        System.out.println("season : " + Arrays.toString(season));
//        // season 배열의 마지막 값을 출력 하기위해 길이에서 -1
//        System.out.println("season : " + season[season.length - 1]);
//    }
//}
//
//
//// 자료형 퀴즈
//// 퀴즈1
///* public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        char c = 'S';
//        int num = 10;
//        System.out.println(c);
//        System.out.println(num);
//    }
//}*/
//// 퀴즈2
///*public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int[] num = {10, 20, 30};
//        System.out.println(num[num.length-1]);
//        System.out.println(num[2]);
//    }
//}*/
//
//
//// 연산자
//// 산술 연산자
///*public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int num1 = 10;
//        int num2 = 5;
//
//        System.out.println(num1 + num2); // 더하기 연산
//        System.out.println(num1 - num2); // 빼기 연산
//        System.out.println(num1 * num2); // 곱하기 연산
//        System.out.println(num1 / num2); // 나누기 연산
//        System.out.println(num1 % num2); // 나머지 연산
//    }
//}*/
//// 대입 연산자
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int num1 = 10;
//        int num2 = 5;
//
//        num1 += num2; // num1 = num1 + num2
//        System.out.println(num1);
//
//        num1 -= num2; // num1 = num1 - num2
//        System.out.println(num1);
//
//        num1 *= num2; // num1 = num1 * num2
//        System.out.println(num1);
//
//        num1 /= num2; // num1 = num1 / num2
//        System.out.println(num1);
//
//        num1 %= num2; // num1 = num1 % num2
//        System.out.println(num1);
//    }
//}
//*/
//// 관계 연산자
///*public class Main {
//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
//        int num3 = 10;
//
//        System.out.println(num1 > num2); // 10 > 20
//        System.out.println(num1 >= num3); // 10 >= 10
//        System.out.println(num1 < num2); // 10 < 20
//        System.out.println(num1 <= num2); // 10 <= 20
//        System.out.println(num1 == num3); // 10 == 10
//        System.out.println(num1 != num2); // 10 != 20
//    }
//}*/
//// 논리 연산자
///*public class Main {
//    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//
//        System.out.println(a && b);
//        // &&는 두가지 모두 참일 경우에는 true를, 그렇지 않을 경우에는 false를 반환합니다.
//        System.out.println(a || b);
//        // ||는 두가지 모두 거짓일 경우에는 false를, 그렇지 않을 경우에는 true를 반환합니다.
//        System.out.println(!b);
//        // !는 피연산자의 논리값을 바꿉니다. true는 false로 , false는 true로 반환합니다.
//    }
//}*/
//// 비트 연산자
///*public class Main {
//    public static void main(String[] args) {
//
//    }
//}*/
//// 연산자 - 퀴즈 1 : 주어진 코드를 보고 출력 결과를 생각해보세요.
///*public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int num1 = 10;
//        int num2 = 3;
//        boolean bool1 = true;
//        boolean bool2 = false;
//        num1 += num1;
//        num2 *= num1;
//        System.out.println(num1);   //  20
//        System.out.println(num2);   //  60
//        System.out.println(bool1 && bool2);     //  false
//    }
//}*/
//
//
//// 조건문
//// if 문
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int check = 100;
//        int num1 = 150;
//
//        if (num1 > check) {
//            System.out.println("100보다 큰 수 입니다.");
//        } else if (num1 > 50) {
//            System.out.println("50보다 큰 수 입니다. 100보다 작거나 같습니다.");
//        }
//    }
//}*/
//// switch 문
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        char score = 'B';
//        // 일치하는 경우를 찾기 위해 서용
//        switch (score) {
//            case 'A':
//                System.out.println("A등급 축하합니다.");
//                break;
//            case 'B':
//                System.out.println("B등급");
//                break;
//            case 'C':
//                System.out.println("C등급");
//            default:
//                System.out.println("C보다 아래 등급입니다.");
//        }
//    }
//}*/
//// 삼항연산자
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int a = 5;
//        String result = (a < 10) ? "10보다 작습니다" : "10보다 큽니다";
//        System.out.println(result);
//    }
//}*/
//
//
//// 조건문 퀴즈
///*
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("점수 입력 : ");
//        int score = sc.nextInt();
//
//        // if문
//        if (score <= 100 && score > 90) {
//            System.out.println("A등급");
//        } else if (score <= 90 && score > 80) {
//            System.out.println("B등급");
//        } else if (score <= 80 && score > 70) {
//            System.out.println("C등급");
//        } else {
//            System.out.println("F등급");
//        }
//
//
//        }
//    }
//}
//*/
//
//
//// 반복문
//// for문
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += (i + 1);
//        }
//        System.out.println(sum);
//    }
//}*/
//// for-each문
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        // 배열을 반복할 때
//        for (String day : days) {
//            System.out.println(day);
//        }
//    }
//}*/
//// while문
///*
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int i = 0;
//        int sum = 0;
//        while (i < 10) {
//            sum += (i + 1);
//            i++;
//        }
//        System.out.println(sum);
//    }
//}*/
//// do-while문
///*public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int i = 0;
//        int sum = 0;
//        do {
//            sum += (i + 1);
//            i++;
//        } while (i < 10);
//        System.out.println(sum);
//    }
//}*/
//
//
//// 반복문 퀴즈
//// 퀴즈1
//public class Main1 {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += i + 1;
//        }
//        System.out.println(sum);
//    }
//}
//// 퀴즈2
///*public class Main {
//    public static void main(String[] args) {
//        for (int i = 5; i >= 0; i--) {
//            System.out.println("카운트다운 " + i);
//            if (i == 0) {
//                System.out.println("카운트다운 종료");
//            }
//        }
//    }
//}*/
//// 퀴즈3
///*
//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i <= 30; i++) {
//            if (i % 2 == 0) {
//                a += i;
//            } else {
//                b += i;
//            }
//        }
//        System.out.println("짝수의 합 :" + a);
//        System.out.println("홀수의 합 :" + b);
//    }
//}*/
/*====================================================================================================================*/
/* 객체 지향 언어 */
//// 객체지향언어(1) 클래스, 인스턴스, 메소드
//// 클래스
///*
//class Phone {
//    String model;
//    String color;
//    int price;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Phone galaxy = new Phone();
//        galaxy.model = "Galaxy10";
//        galaxy.color = "Black";
//        galaxy.price = 100;
//
//        Phone iphone = new Phone();
//        iphone.model = "iPhoneX";
//        iphone.color = "Black";
//        iphone.price = 200;
//
//
//        System.out.println("철수는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
//        System.out.println("영희는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
//    }
//}*/
//// 메소드
///*
//public class Main {
//    public static void main(String[] args) {
//        int[] heights = new int[]{10, 20, 30, 40, 50};
//
////        intHeight(heights);
////        sortHeight(heights);
////        printHeight(heights);
//
//    }
//
//    // 메소드 생성시 룰
//    // 1. 동사로 시작
//    // 2. 단어는 대문자로 구분
//
//    int add(int x, int y) {
//        int result = x + y;
//        return result;
//    }
//
//    int minus(int x, int y) {
//        int result = x - y;
//        return result;
//    }
//}
//// 메소드 연습
//class Calculation {
//    int add(int x, int y) {
//        return x + y;
//    }
//
//    int subtract(int x, int y) {
//        return x - y;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // 외부 클래스를 사용하기 위해 선언
//        Calculation calculation = new Calculation();
//
//        int addResult = calculation.add(1, 2);
//        int subtractResult = calculation.subtract(5, 3);
//
//        System.out.println(addResult);
//        System.out.println(subtractResult);
//    }
//}*/
//
//// 객체지향언어(2) 생성자
///*
//class Phone {
//    String model;
//    String color;
//    int price;
//
//    public Phone(String model, String color, int price) {
//        this.model = model;
//        this.color = color;
//        this.price = price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Phone galaxy = new Phone("galaxy10", "black", 100);
//
//        Phone iphone = new Phone("iphoneXS", "space gray", 200);
//
//        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
//        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
//    }
//}*/
//// 인스턴스 변수의 기본값
///*
//class DefaultValueTest {
//    byte byteDefaultValue;
//    int intDefaultValue;
//    short shortDefaultValue;
//    long longDefaultValue;
//    float floatDefaultValue;
//    double doubleDefaultValue;
//    boolean booleanDefaultValue;
//    String referenceDefaultValue;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        DefaultValueTest defaultValueTest = new DefaultValueTest();
//        System.out.println("byte default: " + defaultValueTest.byteDefaultValue);
//        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
//        System.out.println("int default: " + defaultValueTest.intDefaultValue);
//        System.out.println("long default: " + defaultValueTest.longDefaultValue);
//        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
//        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
//        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
//        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
//    }
//}*/
///*
//class Phone {
//    String model;
//    String color;
//    int price;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Phone galaxy = new Phone();
//
//        Phone iphone = new Phone();
//
//        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
//        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
//    }
//}*/
//
//// 객체지향언어(3) 상속
//// 상속
///*
//class Animal {
//    String name;
//
//    public void cry() {
//        System.out.println(name + " is crying.");
//    }
//}
//
//class Dog extends Animal {
//
//    Dog(String name) {
//        this.name = name;
//    }
//
//    public void swim() {
//        System.out.println(name + " is swimming!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("하늘");
//        dog.cry();
//        dog.swim();
//
//        Animal dog2 = new Dog("사랑");
//        dog2.cry();
////        dog2.swim(); // compile error
//    }
//}*/
//// 오버로딩
///*
//public class Main {
//    public static void main(String[] args) {
//
//    }
//
//    int add(int x, int y, int z) {
//        return x + y + z;
//    }
//
//    int add(int a, int b) {
//        return a + b + c;
//    }
//}*/
//// 오버라이딩
///*
//class Animal {
//    String name;
//    String color;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void cry() {
//        System.out.println(name + " is crying");
//    }
//}
//
//class Dog extends Animal {
//    public Dog(String name) {
//        super(name);
//    }
//
//    @Override
//    public void cry() {
//        System.out.println(name + "is barking");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        Animal dog = new Dog("하늘");
//        dog.cry();
//    }
//}*/
//
//// 객체지향언어(4) 접근제어자
///*
//class Child extends ModifierTest {
//    void callParentProtected() {
//        System.out.println("call my parent's protected method");
//        super.messageProtected();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ModifierTest modifierTest = new ModifierTest();
//        modifierTest.messageOutside();
////        modifierTest.messageInside();
////        modifierTest.messageProtected();
////        modifierTest.messanePackagePrivate();
//
//        Child child = new Child();
//        child.callParentProtected();
//
//        Scanner scanner = new Scanner(System.in);
//    }
//}*/
//
//// 객체지향언어(5) 추상클래스, 인터페이스
//// 추상클래스
///*
//abstract class Bird
//
//{
//    private int x, y, z;
//
//    void fly(int x, int y, int z) {
//        printLocation();
//        System.out.println("이동합니다.");
//        this.x = x;
//        this.y = y;
//        if (flyable(z)) {
//            this.z = z;
//        } else {
//            System.out.println("그 높이로는 날 수 없습니다.");
//        }
//        printLocation();
//    }
//
//    abstract boolean flyable(int z);
//
//    public void printLocation() {
//        System.out.println("현재 위치 {" + x + ", " + y + ", " + z + "}");
//    }
//}
//
//class Pigeon extends Bird {
//
//    @Override
//    boolean flyable(int z) {
//        return z < 10000;
//    }
//}
//
//class Peacock extends Bird {
//
//    @Override
//    boolean flyable(int z) {
//        return false;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Bird pigeon = new Pigeon();
//        Bird peacock = new Peacock();
//        System.out.println("=== 비둘기 ===");
//        pigeon.fly(1, 1, 3);
//        System.out.println("=== 공작새 ===");
//        peacock.fly(1, 1, 3);
//        System.out.println("=== 비둘기 ===");
//        pigeon.fly(3, 3, 30000);
//    }
//}*/
//// 인터페이스
///*
//interface Flyable {
//    void fly(int x, int y, int z);
//}
//
//class Pigeon implements Flyable {
//    private int x, y, z;
//
//    @Override
//    public void fly(int x, int y, int z) {
//        System.out.println("날아갑니다.");
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        printLocation();
//    }
//
//    public void printLocation() {
//        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ") ");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Flyable pigeon = new Pigeon();
//        pigeon.fly(1, 2, 3);
//    }
//}*/


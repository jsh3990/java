package day05;

//객체를 만들기 위한 설계도 클래스(이런 클래스는 메인이 없다.)
public class Pen {

    //클래스의 속성 나타내는 것 멤버변수(field)라고 부름
    String ink;
    int price;

    //클래서에서 기능을 나타내는 것을 메서드
    void write() {
        System.out.println("=====info====");
        System.out.println("색상:" + ink);
        System.out.println("가격:" + price);

    }

}

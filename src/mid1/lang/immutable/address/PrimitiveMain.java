package mid1.lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본현은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a -> b 값 복사 후 대입 (a 에 있는 값 10을 복사해서 b 에 전달. 메모리 상에서도 a 에 속하는 10 과 b 에 속하는 10 이 각 각 별도로 존재)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
기본형(Primitive Type) : 하나의 값을 여러 변수에서 절대로 공유하지 않는다.
참조형(Reference Type) : 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다
 */
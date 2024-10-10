package mid1.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); //컴파일 오류 발생
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
정리
불변이라는 단순한 제약을 사용해서 사이드 이펙트라는 큰 문제를 막을 수 있다.
- 객체의 공유 참조는 막을 수 없다.
    그래서 객체의 값을 변경하면 다른 곳에서 참조하는 변수의 값도 함께 변경되는 사이드 이펙트가 발생한다.
    사이드 이펙트가 발생하면 안되는 상황이라면 불변 객체를 만들어서 사용하면 된다.
    불변 객체는 값을 변경할 수 없기 때문에 사이드 이펙트가 원천 차단된다.
- 불변 객체는 값을 변경할 수 없다.
    따라서 불변 객체의 값을 변경하고 싶다면 변경하고 싶은 값으로 새로운 불변 객체를 생성해야 한다.
    이렇게 하면 기존 변수들이 참조하는 값에는 영향을 주지 않는다.

참고
가변(Mutable) 객체 vs 불변(Immutable) 객체
- 가변은 이름 그대로 처음 만든 이후 상태가 변할 수 있다는 뜻이다. : Address 는 가변 클래스이다. 이 클래스로 객체를 생성하면 가변 객체가 된다.
- 불변은 이름 그대로 처음 만든 이후 상태가 변하지 않는다는 뜻이다. : ImmutableAddress 는 불변 클래스이다. 이 클래스로 객체를 생성하면 불변 객체가 된다.
 */
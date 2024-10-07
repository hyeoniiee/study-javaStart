package mid1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString() 은 Object 클래스의 메서드
        String string = child.toString(); // 이 메서드는 객체의 정보를 제공
        System.out.println(string);
    }
}
/*
Object 가 제공하는 기능
객체의 정보를 제공하는 toString()
객체의 같음을 비교하는 equals()
객체의 클래스 정보를 제공하는 getClass()
기타 여러가지 기능

Object 는 모든 객체를 다 담을 수 있다.
타입이 다른 객체들을 어딘가에 보관해야 한다면 바로 Object 에 보관하면 된다.
 */
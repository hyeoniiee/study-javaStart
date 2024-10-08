package mid1.lang.object;

public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
    /*
    클래스에 상속 받을 부모 클래스를 명시적으로 지정하면 Object 를 상속 받지 않는다.
    -> 이미 명시적으로 상속했기 때문에 자바가 extends Object 코드를 넣지 않는다.
     */
}

/*
묵시적(Implicit) vs 명시적(Explicit)
묵시적: 개발자가 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는 것을 의미
명시적: 개발자가 코드에 직접 기술해서 작동하는 것을 의미
 */
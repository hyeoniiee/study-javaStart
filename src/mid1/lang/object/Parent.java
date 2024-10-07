package mid1.lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다. (여기서 묵시적이란 내가 막 적어주지 않아도 뭔가 자동으로 뭔가 된다는 걸로 보면 된다.)
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }

    /*
    클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속 받는다.
    위 코드 [ public class Parent ] 는 [ public class Parent extends Object ] 코드와 같고,
    쉽게 이야기해서 자바가 extends Object 코드를 넣어준다.
    -> 따라서 extends Object 응 생략하는것을 권장한다.
     */
}

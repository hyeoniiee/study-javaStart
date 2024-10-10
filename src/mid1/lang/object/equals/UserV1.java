package mid1.lang.object.equals;

public class UserV1 {
    private String id;

    public UserV1(String id) {
        this.id = id;
    }
}
/**
 * 동일성(Identity) : == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
 * 동등성(Equality) : equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
 * -> 동일성은 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인하는 것이고, 동등성은 논리적으로 같은지 확인
 *
 * 동일성은 자바 머신 기준이고 메모리의 참조가 기준이므로 물리적
 * 동등성은 보통 사람이 생각하는 논리적인 기준에 맞추어 비교
 */
package mid1.lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
    // println() 을 사용할 때, toString() 을 직접 호출할 필요 없이 객체를 바로 전달하면 객체의 정보를 출력 할 수 있다.
}

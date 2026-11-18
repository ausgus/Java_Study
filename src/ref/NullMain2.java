package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //Null Pointer Exception 예외 발생 => 널 타입에 닷연산자 썼음
        System.out.println("data = " + data);
    }
}

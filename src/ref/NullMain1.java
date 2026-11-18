package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; //참조형 데이터에만 사용가능
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        data = new Data();
        System.out.println("4. data = " + data);

    }
}

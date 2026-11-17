package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.productPrice = 2000;
        order1.productQuantity = 2;


        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.productPrice = 5000;
        order2.productQuantity = 1;


        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.productPrice = 1500;
        order3.productQuantity = 2;

        ProductOrder[] orders = {order1, order2, order3};
        int total = 0;

        for (ProductOrder order : orders) {
            total += order.productPrice * order.productQuantity;

            System.out.println("상품명: " + order.productName + ", 가격: " + order.productPrice + ", 수량: " + order.productQuantity);
        }

        System.out.println("총 결제 금액: " + total);
    }
}

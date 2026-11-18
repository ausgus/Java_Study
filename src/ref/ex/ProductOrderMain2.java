package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);


        ProductOrder[] orders = {order1, order2, order3};
        printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 = " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + ", 가격 : " + orders[i].price + ", 수량 : " + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}

package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductOrder[] orders;
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            scanner.nextLine();
            //상품명 입력
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            //가격 입력
            System.out.print("가격: ");
            int price = scanner.nextInt();
            //수량 입력
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            //주문 인스턴스 생성 및 배열에 추가
            orders[i] = createOrder(productName, price, quantity);
        }


        printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 = " + totalAmount);
    }

    //주문 생성 메서드
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    //전체 주문 출력
    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    //총액 계산
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}

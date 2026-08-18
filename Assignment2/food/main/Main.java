package food.main;

import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.utility.OrderUtility;

public class Main {

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Pranav", 500);
        orders[1] = new PremiumOrder(102, "Rahul", 800);
        orders[2] = new RegularOrder(103, "Sparsh", 600);
        orders[3] = new PremiumOrder(104, "Priya", 1000);
        orders[4] = new RegularOrder(105, "Karan", 750);
        orders[5] = new PremiumOrder(106, "Neha", 1200);

        for (FoodOrder order : orders) {

            if (OrderUtility.validateAmount(order.getAmount())
                    && OrderUtility.validateCustomerName(order.getCustomerName())) {

                OrderUtility.generateOrderSummary(order);

            } else {
                System.out.println("Invalid order details for Order ID: "
                        + order.getOrderId());
            }
        }

        FoodOrder.displayTotalOrders();
    }
}
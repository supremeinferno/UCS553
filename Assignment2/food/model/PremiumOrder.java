package food.model;

import food.service.Discountable;

public class PremiumOrder extends FoodOrder implements Discountable {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 50.0;
    }

    @Override
    public double applyDiscount() {
        return getAmount() * 0.15;
    }
}
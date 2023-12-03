package org.example;

import com.google.inject.Inject;
import data.Discountable;

public class CheckoutService {
    private Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double amount) {
        double finalPrice = amount * discountable.getDiscount();
        System.out.printf("Price = %s, Discounted price = %s %n", amount, finalPrice);
        return finalPrice;
    }
}

package com.bofa.basket.promos;

import org.joda.money.Money;

public class ExpensiveBasketPromotion {

    Money total;
    Money money;

    public ExpensiveBasketPromotion(Money total, Money money) {
        this.total = total;
        this.money = money;
    }

    public boolean isApplicable(Basket basket) {
        return false;
    }

    public Money discount(Basket basket) {
        return null;
    }
}

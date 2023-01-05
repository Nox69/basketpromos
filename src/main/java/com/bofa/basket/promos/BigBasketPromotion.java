package com.bofa.basket.promos;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class BigBasketPromotion {

    int minItems;
    int amount;
    CurrencyUnit currencyUnit;

    public BigBasketPromotion(int minItems, int amount, CurrencyUnit currencyUnit) {
        this.minItems = minItems;
        this.amount = amount;
        this.currencyUnit = currencyUnit;
    }

    public boolean isApplicable(Basket basket) {
        return false;
    }

    public Money discount(Basket basket) {
        return null;
    }

}

package com.bofa.basket.promos;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Promotions {

    private final BigBasketPromotion bigBasketPromotion = new BigBasketPromotion(40, 5, CurrencyUnit.EUR);
    private final ExpensiveBasketPromotion expensiveBasketPromotion = new ExpensiveBasketPromotion(
            Money.of(CurrencyUnit.EUR, 100),
            Money.of(CurrencyUnit.EUR, 10)
    );

    public Money calculateDiscount(Basket basket){
        if(bigBasketPromotion.isApplicable(basket)) {
            return bigBasketPromotion.discount(basket);
        }
        if(expensiveBasketPromotion.isApplicable(basket)) {
            return expensiveBasketPromotion.discount(basket);
        }
        return null;
    }

}

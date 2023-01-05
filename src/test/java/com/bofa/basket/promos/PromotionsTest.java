package com.bofa.basket.promos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.joda.money.CurrencyUnit.EUR;

import org.joda.money.Money;
import org.junit.Test;

public class PromotionsTest {

    public static Basket SMALL_BASKET = new Basket(){{
        products.put(new Product("milk", Money.of(EUR, 1.5)), 1);
    }};

    public static Basket EXPENSIVE_BASKET = new Basket(){{
        products.put(new Product("milk", Money.of(EUR, 1.5)), 100);
    }};

    Promotions promotions = new Promotions();

    @Test
    public void applyPromotions() {

        assertThat(promotions.calculateDiscount(SMALL_BASKET)).isEqualTo(Money.of(EUR, 0));

        Basket basket = new Basket();
        for (int i = 0; i < 100; i++) {
            basket.products.put(new Product("1", Money.of(EUR, 1)), 1);
            assertThat(promotions.calculateDiscount(basket)).isEqualTo(i < 40 ? Money.of(EUR, 0) : Money.of(EUR, 5));
        }

        assertThat(promotions.calculateDiscount(EXPENSIVE_BASKET)).isEqualTo(Money.of(EUR, 10));

    }
}
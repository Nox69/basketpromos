package com.bofa.basket.promos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.joda.money.CurrencyUnit.EUR;

import org.joda.money.Money;
import org.junit.Test;

public class PromotionsTest {

    public static Basket BASKET_A = new Basket() {
        {
            products.put(new Product("Milk", Money.of(EUR, 2)), 1);
        }
    };

    public static Basket BASKET_B = new Basket() {
        {
            products.put(new Product("Pencil-TypeA", Money.of(EUR, 1)), 99);
        }
    };

    public static Basket BASKET_C = new Basket() {
        {
            products.put(new Product("Pencil-TypeA", Money.of(EUR, 1)), 100);
        }
    };

    public static Basket BASKET_D = new Basket() {
        {
            products.put(new Product("Milk", Money.of(EUR, 2)), 10);
            products.put(new Product("Pencil", Money.of(EUR, 1)), 10);
            products.put(new Product("Orange", Money.of(EUR, 1)), 5);
            products.put(new Product("Banana", Money.of(EUR, 1)), 5);
            products.put(new Product("Oil", Money.of(EUR, 2)), 1);
            products.put(new Product("Coffee", Money.of(EUR, 1)), 10);
            products.put(new Product("Tissues", Money.of(EUR, 1)), 10);
            products.put(new Product("Cashews", Money.of(EUR, 5)), 100);
            products.put(new Product("Cheese", Money.of(EUR, 1)), 10);
            products.put(new Product("Meat", Money.of(EUR, 5)), 10);
            products.put(new Product("Chocolates", Money.of(EUR, 1)), 20);
            products.put(new Product("Water", Money.of(EUR, 1)), 10);
            products.put(new Product("Beer", Money.of(EUR, 1)), 20);
        }
    };

    Promotions promotions = new Promotions();

    @Test
    public void applyPromotions() {

        assertThat(promotions.calculateDiscount(BASKET_A)).isEqualTo(Money.of(EUR, 0));

        assertThat(promotions.calculateDiscount(BASKET_B)).isEqualTo(Money.of(EUR, 0));

        Basket basket = new Basket();
        for (int i = 1; i < 100; i++) {
            basket.products.put(new Product("Pencil-Type" + i, Money.of(EUR, 1)), 1);
            assertThat(promotions.calculateDiscount(basket)).isEqualTo(i <= 10 ? Money.of(EUR, 0) : Money.of(EUR, 10));
        }

        assertThat(promotions.calculateDiscount(BASKET_C)).isEqualTo(Money.of(EUR, 20));

        // assertThat(promotions.calculateDiscount(BASKET_D)).isEqualTo(Money.of(EUR, ?));

    }
}
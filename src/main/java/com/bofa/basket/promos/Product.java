package com.bofa.basket.promos;

import org.joda.money.Money;

public class Product {

    String product;

    Money price;

    public Product(String product, Money price) {
        this.product = product;
        this.price = price;
    }
}

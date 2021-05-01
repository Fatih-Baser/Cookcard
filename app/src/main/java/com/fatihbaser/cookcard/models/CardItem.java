package com.fatihbaser.cookcard.models;

import com.fatihbaser.cookcard.views.ProjectDetailFragment;

import java.util.Objects;

public class CardItem {
    private Product product;
    private int quantity;


    public CardItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardItem cardItem = (CardItem) o;
        return quantity == cardItem.quantity &&
                product.equals(cardItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }
}

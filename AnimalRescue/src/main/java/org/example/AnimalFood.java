package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private LocalDate expirationDate;
    private String stockAvailability;

    public AnimalFood() {
    }

    public AnimalFood(String name, int price, int quantity, LocalDate expirationDate, String stockAvailability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stockAvailability = stockAvailability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(String stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    @Override
    public String toString() {
        return "AnimalFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate=" + expirationDate +
                ", stockAvailability=" + stockAvailability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalFood that)) return false;
        return getPrice() == that.getPrice() && getQuantity() == that.getQuantity()
                && isStockAvailability() == that.isStockAvailability()
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getExpirationDate(), that.getExpirationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getQuantity(), getExpirationDate(), isStockAvailability());
    }
}

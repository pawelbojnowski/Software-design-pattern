package pl.pb.programming.patterns.chainofresponsibility;

import java.math.BigDecimal;

public class Order {

    public enum Country {PL, DE, IT}

    private BigDecimal price;
    private BigDecimal discount;
    private Country destination;


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Country getDestination() {
        return destination;
    }

    public void setDestination(Country destination) {
        this.destination = destination;
    }
}

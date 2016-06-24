package pl.pb.programming.patterns.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountCalculatorOrder extends AbstractCalculatorOrder {

    @Override
    public BigDecimal calculate(Order order) {
        BigDecimal discountedPrice = countDiscount(order);
        order.setPrice(discountedPrice);

        //return value if null next step OR go to nex step
        if (nextStep == null) {
            return order.getPrice();
        } else {
            return nextStep.calculate(order);
        }

    }

    private BigDecimal countDiscount(Order order) {

        if (order.getDiscount() != null) {
            BigDecimal discount = order.getPrice().multiply(order.getDiscount());
            return order.getPrice().subtract(discount);
        } else {
            return order.getPrice();
        }
    }


}

package pl.pb.designpattern.chainofresponsibility;

import java.math.BigDecimal;
import java.math.MathContext;

public class ChainOfResponsibilityPattern {

    public static void main(String... arg) {

        discountAndSupply();

        discount();

        supply();

    }

    private static void discountAndSupply() {
        Order orderDiscountAndSupply = createOrder();

        AbstractCalculatorOrder discountAndSupplyCalculator = new DiscountCalculatorOrder();
        discountAndSupplyCalculator.setNextStep(new SupplyCalculatorOrder());

        BigDecimal priceDiscountAndSupply = discountAndSupplyCalculator.calculate(orderDiscountAndSupply);

        System.out.println("priceDiscountAndSupply: " + priceDiscountAndSupply.round(MathContext.DECIMAL32));
    }

    private static void discount() {
        Order orderDiscount = createOrder();

        AbstractCalculatorOrder discountCalculator = new DiscountCalculatorOrder();

        BigDecimal priceDiscount = discountCalculator.calculate(orderDiscount);

        System.out.println("priceDiscount: " + priceDiscount.round(MathContext.DECIMAL32));
    }


    private static void supply() {
        Order orderSupply = createOrder();

        AbstractCalculatorOrder supplyCalculator = new SupplyCalculatorOrder();

        BigDecimal priceSupply = supplyCalculator.calculate(orderSupply);

        System.out.println("priceSupply: " + priceSupply.round(MathContext.DECIMAL32));
    }


    private static Order createOrder() {
        Order order = new Order();
        order.setPrice(new BigDecimal(100));
        order.setDiscount(new BigDecimal(0.1));
        order.setDestination(Order.Country.PL);
        return order;
    }
}

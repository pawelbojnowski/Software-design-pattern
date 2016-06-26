package pl.pb.designpattern.chainofresponsibility;

import java.math.BigDecimal;

public class SupplyCalculatorOrder extends AbstractCalculatorOrder {

    @Override
    public BigDecimal calculate(Order order) {

        calculatePrice(order);

        //return value if null next step OR go to nex step
        if (nextStep == null) {
            return order.getPrice();
        } else {
            return nextStep.calculate(order);
        }
    }

    private void calculatePrice(Order order) {
        BigDecimal supplyPrice = getSupplyPrice(order);
        BigDecimal newPrice = order.getPrice().add(supplyPrice);
        order.setPrice(newPrice);
    }

    private BigDecimal getSupplyPrice(Order order) {
        BigDecimal supplyPrice = new BigDecimal(100);

        //there is a good place for the STRATEGY pattern but it will be better doesn't mix up patterns
        if (order.getDestination() != null) {
            switch (order.getDestination()) {
                case PL:
                    supplyPrice = new BigDecimal(20);
                    break;
                case IT:
                    supplyPrice = new BigDecimal(25);
                    break;
                case DE:
                    supplyPrice = new BigDecimal(30);
                    break;
                default:
                    supplyPrice = new BigDecimal(100);
            }
        }
        return supplyPrice;
    }


}

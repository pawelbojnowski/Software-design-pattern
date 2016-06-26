package pl.pb.designpattern.strategy;

import java.math.BigDecimal;

public class ItalyTax implements pl.pb.designpattern.strategy.TaxStrategy {

    private static final BigDecimal tax = new BigDecimal(0.22);

    public BigDecimal calculate(BigDecimal netPrice) {
        return netPrice.add(netPrice.multiply(tax));
    }
}

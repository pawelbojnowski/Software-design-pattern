package pl.pb.programming.patterns.strategy;

import java.math.BigDecimal;

public class GermanTax implements TaxStrategy {

    private static final BigDecimal tax = new BigDecimal(0.19);

    public BigDecimal calculate(BigDecimal netPrice) {
        return netPrice.add(netPrice.multiply(tax));
    }
}

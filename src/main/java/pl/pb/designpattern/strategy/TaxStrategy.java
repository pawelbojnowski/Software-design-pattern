package pl.pb.programming.patterns.strategy;

import java.math.BigDecimal;

//Strategy interfaces
public interface TaxStrategy {

    BigDecimal calculate(BigDecimal netPrice);
}

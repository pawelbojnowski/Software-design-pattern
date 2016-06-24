package pl.pb.programming.patterns.strategy;

import java.math.BigDecimal;
import java.math.MathContext;

public class StrategyPattern {

    public static void main(String... arg) {

        TaxContext taxContext = new TaxContext();
        taxContext.setCountry(TaxContext.Country.PL);

        BigDecimal netPrice = new BigDecimal(100);

        TaxStrategy taxStrategy = taxContext.getTaxStrategy();
        BigDecimal grossPrice = taxStrategy.calculate(netPrice);
        System.out.println("Gross Price: " + grossPrice.round(MathContext.DECIMAL32));

        BigDecimal grossPriceSecond = taxContext.calculate(netPrice);
        System.out.println("Gross Price second: " + grossPriceSecond.round(MathContext.DECIMAL32));

    }
}

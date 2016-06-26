package pl.pb.designpattern.strategy;

import java.math.BigDecimal;

//Context
public class TaxContext {

    public enum Country {PL, DE, IT}

    private TaxStrategy taxStrategy;

    public void setCountry(Country country) {

        switch (country) {
            case PL:
                taxStrategy = new PolandTax();
                break;
            case IT:
                taxStrategy = new ItalyTax();
                break;
            case DE:
                taxStrategy = new GermanTax();
                break;
        }
    }

    public BigDecimal calculate(BigDecimal netPrice) {
        return taxStrategy.calculate(netPrice);
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }
}

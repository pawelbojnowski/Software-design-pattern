package pl.pb.programming.patterns.chainofresponsibility;

import java.math.BigDecimal;

public abstract class AbstractCalculatorOrder {

    AbstractCalculatorOrder nextStep;

    public void setNextStep(AbstractCalculatorOrder nextStep) {
        this.nextStep = nextStep;
    }

    public abstract BigDecimal calculate(Order order);

}

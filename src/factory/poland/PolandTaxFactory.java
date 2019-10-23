package factory.poland;

import factory.TaxFactory;
import strategy.LinearTaxStrategy;
import strategy.ProgressiveTaxStrategy;
import strategy.TaxStrategy;

public class PolandTaxFactory implements TaxFactory {

    private static final double threshold = 10000;
    private static final double firstTaxThreshold = 0.19;

    private static final double secondTaxFirstThreshold = 0.18;
    private static final double secondTaxSecondThreshold = 0.32;


    @Override
    public TaxStrategy makeLinearTax() {
        return new LinearTaxStrategy(firstTaxThreshold);
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new ProgressiveTaxStrategy(threshold, secondTaxFirstThreshold, secondTaxSecondThreshold);
    }
}

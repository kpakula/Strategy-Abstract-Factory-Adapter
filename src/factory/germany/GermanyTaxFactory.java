package factory.germany;

import factory.TaxFactory;
import strategy.LinearTaxStrategy;
import strategy.ProgressiveTaxStrategy;
import strategy.TaxStrategy;

public class GermanyTaxFactory implements TaxFactory {
    private static final double threshold = 50000;
    private static final double firstTaxThreshold = 0.2;
    private static final double secondTaxThreshold = 0.4;


    @Override
    public TaxStrategy makeLinearTax() {
        return new LinearTaxStrategy(firstTaxThreshold);
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new ProgressiveTaxStrategy(threshold, firstTaxThreshold, secondTaxThreshold);
    }
}

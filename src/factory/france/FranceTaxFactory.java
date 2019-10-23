package factory.france;

import factory.TaxFactory;
import strategy.LinearTaxStrategy;
import strategy.ProgressiveTaxStrategy;
import strategy.TaxStrategy;

public class FranceTaxFactory implements TaxFactory {
    private static final double threshold = 40000;
    private static final double firstTaxThreshold = 0.3;
    private static final double secondTaxThreshold = 0.5;


    @Override
    public TaxStrategy makeLinearTax() {
        return new LinearTaxStrategy(firstTaxThreshold);
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new ProgressiveTaxStrategy(threshold, firstTaxThreshold, secondTaxThreshold);
    }
}

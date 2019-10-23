package factory.usa;

import factory.TaxFactory;
import strategy.LinearTaxStrategy;
import strategy.TaxStrategy;

public class USATaxFactory implements TaxFactory {
    private static final double taxThreshold = 0.1;



    @Override
    public TaxStrategy makeLinearTax() {
        return new LinearTaxStrategy(taxThreshold);
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new LinearTaxStrategy(taxThreshold);
    }
}

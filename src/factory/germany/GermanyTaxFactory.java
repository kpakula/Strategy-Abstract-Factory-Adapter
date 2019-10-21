package factory.germany;

import factory.TaxFactory;
import strategy.TaxStrategy;

public class GermanyTaxFactory implements TaxFactory {
    @Override
    public TaxStrategy makeLinearTax() {
        return new GermanyLinearTax();
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new GermanyProgressiveTax();
    }
}

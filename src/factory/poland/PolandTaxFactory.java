package factory.poland;

import factory.TaxFactory;
import strategy.TaxStrategy;

public class PolandTaxFactory implements TaxFactory {

    @Override
    public TaxStrategy makeLinearTax() {
        return new PolandLinearTax();
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new PolandProgressiveTax();
    }
}

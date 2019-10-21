package factory.usa;

import factory.TaxFactory;
import strategy.TaxStrategy;

public class USATaxFactory implements TaxFactory {
    @Override
    public TaxStrategy makeLinearTax() {
        return new USALinearTax();
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new USAProgressiveTax();
    }
}

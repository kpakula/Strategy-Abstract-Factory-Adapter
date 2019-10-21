package factory.france;

import factory.TaxFactory;
import strategy.TaxStrategy;

public class FranceTaxFactory implements TaxFactory {
    @Override
    public TaxStrategy makeLinearTax() {
        return new FranceLinearTax();
    }

    @Override
    public TaxStrategy makeProgressiveTax() {
        return new FranceProgressiveTax();
    }
}

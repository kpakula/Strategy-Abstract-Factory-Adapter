package factory;

import strategy.TaxStrategy;

public interface TaxFactory {
    TaxStrategy makeLinearTax();
    TaxStrategy makeProgressiveTax();
}

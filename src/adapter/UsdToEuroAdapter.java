package adapter;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class UsdToEuroAdapter implements TaxStrategy {
    private static final double euroRate = 3.8 / 3.0;

    private TaxStrategy taxStrategy;

    public UsdToEuroAdapter(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    @Override
    public double calculateTax(List<Item> itemList) {
        return taxStrategy.calculateTax(itemList) / euroRate;
    }
}

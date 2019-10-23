package adapter;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class PlnToEuroAdapter implements TaxStrategy {
    private static final double euroRate = 4.2;

    private TaxStrategy taxStrategy;

    public PlnToEuroAdapter(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    @Override
    public double calculateTax(List<Item> itemList) {
        return taxStrategy.calculateTax(itemList) / euroRate;
    }
}

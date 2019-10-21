package factory.france;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class FranceProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("France Progressive Tax");
        return 0;
    }
}

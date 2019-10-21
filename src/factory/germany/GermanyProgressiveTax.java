package factory.germany;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class GermanyProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Germany Progressive Tax");
        return 0;
    }
}

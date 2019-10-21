package factory.usa;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class USAProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("USA Progressive Tax");
        return 0;
    }
}

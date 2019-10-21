package factory.poland;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class PolandProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Poland Progressive Tax");
        return 0;
    }
}

package factory.poland;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class PolandLinearTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Poland Linear Tax");
        return 0;
    }
}

package factory.usa;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class USALinearTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("USA Linear Tax");
        return 0;
    }
}

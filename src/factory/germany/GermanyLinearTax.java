package factory.germany;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class GermanyLinearTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("German Linear Tax");
        return 0;
    }
}

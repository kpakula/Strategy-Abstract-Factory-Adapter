package strategy;

import items.Item;

import java.util.List;

public class NoTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        double allPrice = 0;

        for (Item item : itemList) {
            allPrice += item.getPrice();
        }
        return allPrice;
    }
}

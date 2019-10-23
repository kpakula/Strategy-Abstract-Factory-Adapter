package strategy;

import items.Item;

import java.util.List;

public class LinearTaxStrategy implements TaxStrategy {

    private Double firstTaxThreshold;

    public LinearTaxStrategy(Double firstTaxThreshold) {
        this.firstTaxThreshold = firstTaxThreshold;
    }

    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Linear");
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }
        return allPrice - (allPrice * firstTaxThreshold);
    }
}

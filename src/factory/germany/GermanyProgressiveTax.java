package factory.germany;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class GermanyProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Germany Progressive Tax");
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }

        double withoutTax = 0;
        if (allPrice <= 50000) {
            withoutTax = allPrice - (allPrice * 0.2);
            return withoutTax;
        } else {
            double firstTax = 50000 * 0.2;
            double priceAfterFirstTax = allPrice - 50000;

            double secondTax = priceAfterFirstTax * 0.4;


            return allPrice - (firstTax + secondTax);
        }
    }
}

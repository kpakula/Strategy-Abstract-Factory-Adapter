package strategy;

import items.Item;

import java.util.List;

public class ProgressiveTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("Progressive");
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }

        double withoutTax = 0;
        if (allPrice <= 10000) {
            withoutTax = allPrice - (allPrice * 18);
            return withoutTax;
        } else {
            double firstTax = 10000 * 0.18;
            double priceAfterFirstTax = allPrice - 10000;

            double secondTax = priceAfterFirstTax * 0.32;


            return allPrice - (firstTax + secondTax);
        }

    }
}

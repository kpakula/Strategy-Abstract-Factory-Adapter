package factory.france;

import items.Item;
import strategy.TaxStrategy;

import java.util.List;

public class FranceProgressiveTax implements TaxStrategy {
    @Override
    public double calculateTax(List<Item> itemList) {
        System.out.println("France Progressive Tax");
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }

        double withoutTax = 0;
        if (allPrice <= 40000) {
            withoutTax = allPrice - (allPrice * 0.3);
            return withoutTax;
        } else {
            double firstTax = 40000 * 0.3;
            double priceAfterFirstTax = allPrice - 40000;

            double secondTax = priceAfterFirstTax * 0.5;


            return allPrice - (firstTax + secondTax);
        }
    }
}

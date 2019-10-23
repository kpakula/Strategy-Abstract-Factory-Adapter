package strategy;

import items.Item;

import java.util.List;

public class ProgressiveTaxStrategy implements TaxStrategy {

    private double threshold;
    private double firstTaxThreshold;
    private double secondTaxThreshold;

    public ProgressiveTaxStrategy(double threshold, double firstTaxThreshold, double secondTaxThreshold) {
        this.threshold = threshold;
        this.firstTaxThreshold = firstTaxThreshold;
        this.secondTaxThreshold = secondTaxThreshold;
    }

    @Override
    public double calculateTax(List<Item> itemList) {
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }

        double withoutTax = 0;
        if (allPrice <= threshold) {
            withoutTax = allPrice - (allPrice * firstTaxThreshold);
            return withoutTax;
        } else {
            double firstTax = threshold * firstTaxThreshold;
            double priceAfterFirstTax = allPrice - threshold;

            double secondTax = priceAfterFirstTax * secondTaxThreshold;


            return allPrice - (firstTax + secondTax);
        }
    }
}

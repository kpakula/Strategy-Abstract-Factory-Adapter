package taxes;

import items.Item;

import java.util.List;

public class Tax {
    private TaxStrategy taxStrategy;

    public Tax(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(List<Item> itemList) {

        return this.taxStrategy.calculateTax(itemList);

    }
}

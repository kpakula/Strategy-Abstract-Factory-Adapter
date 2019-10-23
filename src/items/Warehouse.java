package items;

import items.Item;
import strategy.Tax;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Item> items;

    public Warehouse() {
        this.items = new ArrayList<>();
    }


    public void addToList(Item item) {
        item.calculateValue();
        this.items.add(item);
    }

    public double getValueWithAppliedTax(Tax tax) {
        return tax.calculateTax(this.items);
    }


}

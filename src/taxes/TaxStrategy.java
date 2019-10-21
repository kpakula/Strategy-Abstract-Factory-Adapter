package taxes;

import items.Item;

import java.util.List;

public interface TaxStrategy {
    double calculateTax(List<Item> itemList);
}

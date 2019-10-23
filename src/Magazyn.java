import items.Item;
import strategy.Tax;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Item> items;

    public Magazyn() {
        this.items = new ArrayList<>();
    }


    public void dodajDoSpisu(Item item) {
        item.calculateValue();
        this.items.add(item);
    }

    public double pobierzWartoscPoOpodatkowaniu(Tax tax) {
        return tax.calculateTax(this.items);
    }


}

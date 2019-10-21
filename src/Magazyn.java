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
        this.items.add(item);
        System.out.println("Dodano do spisu");

    }

    public double pobierzWartoscPoOpodatkowaniu(Tax tax) {
        System.out.println("Sumaryczna wartosc po odjeciu podatku");
        return tax.calculateTax(this.items);
    }


}

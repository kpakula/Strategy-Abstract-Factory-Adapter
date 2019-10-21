import items.Book;
import items.Item;
import items.Painting;
import items.Sculpture;
import taxes.*;

public class App {
    public static void main(String[] args) {
        Item book1 = new Book(1999,  2);
        System.out.println(book1.calculateValue());
        Item book2 = new Book(2006,  3);
        System.out.println(book2.calculateValue());


        Item painting1 = new Painting(1800);
        System.out.println(painting1.calculateValue());
        Item painting2 = new Painting(1900);
        System.out.println(painting2.calculateValue());

        Item sculpture1 = new Sculpture(1500, 3);
        System.out.println(sculpture1.calculateValue());

        Item sculpture2 = new Sculpture(900, 5);
        System.out.println(sculpture2.calculateValue());


        TaxStrategy linearTaxStrategy = new LinearTaxStrategy();
        TaxStrategy progressiveTaxStrategy = new ProgressiveTaxStrategy();
        TaxStrategy noTaxStrategy = new NoTaxStrategy();


        Magazyn m1 = new Magazyn();
        m1.dodajDoSpisu(book1);
        m1.dodajDoSpisu(book2);

        m1.dodajDoSpisu(painting1);
        m1.dodajDoSpisu(painting2);

        m1.dodajDoSpisu(sculpture1);
        m1.dodajDoSpisu(sculpture2);


        Tax tax1 = new Tax(noTaxStrategy);
        System.out.println(Math.round(m1.pobierzWartoscPoOpodatkowaniu(tax1) * 100.0) / 100.0);

        tax1 = new Tax(linearTaxStrategy);
        System.out.println(Math.round(m1.pobierzWartoscPoOpodatkowaniu(tax1) * 100.0) / 100.0);

        tax1 = new Tax(progressiveTaxStrategy);
        System.out.println(Math.round(m1.pobierzWartoscPoOpodatkowaniu(tax1) * 100.0) / 100.0);



    }
}

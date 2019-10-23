import adapter.PlnToEuroAdapter;
import adapter.UsdToEuroAdapter;
import factory.france.FranceTaxFactory;
import factory.germany.GermanyTaxFactory;
import factory.poland.PolandTaxFactory;
import factory.TaxFactory;
import factory.usa.USATaxFactory;
import items.Book;
import items.Item;
import items.Painting;
import items.Sculpture;
import strategy.*;


public class App {
    public static void main(String[] args) {
        // All things
        Item book1 = new Book(1999,  2);
        Item book2 = new Book(2006,  3);


        Item painting1 = new Painting(1800);
        Item painting2 = new Painting(1900);

        Item sculpture1 = new Sculpture(1500, 3);
        Item sculpture2 = new Sculpture(900, 5);

        Magazyn m1 = new Magazyn();
        m1.dodajDoSpisu(book1);
        m1.dodajDoSpisu(book2);

        m1.dodajDoSpisu(painting1);
        m1.dodajDoSpisu(painting2);

        m1.dodajDoSpisu(sculpture1);
        m1.dodajDoSpisu(sculpture2);


        //1.
        TaxStrategy linearTaxStrategy = new LinearTaxStrategy();
        TaxStrategy progressiveTaxStrategy = new ProgressiveTaxStrategy();
        TaxStrategy noTaxStrategy = new NoTaxStrategy();


        Tax tax1 = new Tax(noTaxStrategy);
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));

        tax1 = new Tax(linearTaxStrategy);
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));

        tax1 = new Tax(progressiveTaxStrategy);
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));



        // 2.

        System.out.println("\nPOLAND");
        // Poland
        TaxFactory polandFactory = new PolandTaxFactory();
        tax1 = new Tax(polandFactory.makeLinearTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));
        tax1 = new Tax(polandFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));


        System.out.println("\nFRANCE");
        //France
        TaxFactory franceFactory = new FranceTaxFactory();
        tax1 = new Tax(franceFactory.makeLinearTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));
        tax1 = new Tax(franceFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));

        System.out.println("\nGERMANY");
        // Germany
        TaxFactory germanyFactory = new GermanyTaxFactory();
        tax1 = new Tax(germanyFactory.makeLinearTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));
        tax1 = new Tax(germanyFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));

        System.out.println("\nUSA");
        // Usa
        TaxFactory usaFactory = new USATaxFactory();
        tax1 = new Tax(usaFactory.makeLinearTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));
        tax1 = new Tax(usaFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));


        // 3
        TaxFactory polandTaxFactory = new PolandTaxFactory();
        TaxFactory usaTaxFactory = new USATaxFactory();
        TaxFactory franceTaxFactory = new FranceTaxFactory();
        TaxFactory germanyTaxFactory = new GermanyTaxFactory();


        System.out.println("Poland in euro");
        PlnToEuroAdapter plnToEuroAdapterLinear = new PlnToEuroAdapter(polandTaxFactory.makeLinearTax());
        PlnToEuroAdapter plnToEuroAdapterProgressive = new PlnToEuroAdapter(polandTaxFactory.makeProgressiveTax());

        System.out.println("Usa in euro");
        UsdToEuroAdapter usdToEuroAdapterLinear = new UsdToEuroAdapter(usaTaxFactory.makeLinearTax());
        UsdToEuroAdapter usdToEuroAdapterProgressive = new UsdToEuroAdapter(usaTaxFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu()));

        System.out.println("France in euro");
        tax1 = new Tax(franceFactory.makeLinearTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));
        tax1 = new Tax(franceFactory.makeProgressiveTax());
        System.out.println(Rounder.round(m1.pobierzWartoscPoOpodatkowaniu(tax1)));




    }
}

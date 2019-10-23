import adapter.PlnToEuroAdapter;
import adapter.UsdToEuroAdapter;
import factory.france.FranceTaxFactory;
import factory.germany.GermanyTaxFactory;
import factory.poland.PolandTaxFactory;
import factory.TaxFactory;
import factory.usa.USATaxFactory;
import items.*;
import items.util.Rounder;
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

        Warehouse m1 = new Warehouse();
        m1.addToList(book1);
        m1.addToList(book2);

        m1.addToList(painting1);
        m1.addToList(painting2);

        m1.addToList(sculpture1);
        m1.addToList(sculpture2);


        //1.
        System.out.println("1\n------------------------------");
        TaxStrategy linearTaxStrategy = new LinearTaxStrategy(0.19);
        TaxStrategy progressiveTaxStrategy = new ProgressiveTaxStrategy(10000, 0.18, 0.32);
        TaxStrategy noTaxStrategy = new NoTaxStrategy();


        Tax tax = new Tax(noTaxStrategy);
        System.out.println("No tax: " + Rounder.round(m1.getValueWithAppliedTax(tax)));

        tax = new Tax(linearTaxStrategy);
        System.out.println("Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));

        tax = new Tax(progressiveTaxStrategy);
        System.out.println("Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
//
//
//
        // 2.
        System.out.println("\n2\n------------------------------");
        System.out.println("\nPOLAND");
        // Poland
        TaxFactory polandFactory = new PolandTaxFactory();
        tax = new Tax(polandFactory.makeLinearTax());
        System.out.println("Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(polandFactory.makeProgressiveTax());
        System.out.println("Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
//
//
        System.out.println("\nFRANCE");
        //France
        TaxFactory franceFactory = new FranceTaxFactory();
        tax = new Tax(franceFactory.makeLinearTax());
        System.out.println("Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(franceFactory.makeProgressiveTax());
        System.out.println("Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
//
        System.out.println("\nGERMANY");
        // Germany
        TaxFactory germanyFactory = new GermanyTaxFactory();
        tax = new Tax(germanyFactory.makeLinearTax());
        System.out.println("Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(germanyFactory.makeProgressiveTax());
        System.out.println("Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
//
        System.out.println("\nUSA");
        // Usa
        TaxFactory usaFactory = new USATaxFactory();
        tax = new Tax(usaFactory.makeLinearTax());
        System.out.println("Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(usaFactory.makeProgressiveTax());
        System.out.println("Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
//
//
        // 3
        System.out.println("\n3\n------------------------------");
        TaxFactory polandTaxFactory = new PolandTaxFactory();
        TaxFactory usaTaxFactory = new USATaxFactory();
        TaxFactory franceTaxFactory = new FranceTaxFactory();
        TaxFactory germanyTaxFactory = new GermanyTaxFactory();


        // Poland

        System.out.println("\nPoland in euro");
        PlnToEuroAdapter plnToEuroAdapterLinear = new PlnToEuroAdapter(polandTaxFactory.makeLinearTax());
        PlnToEuroAdapter plnToEuroAdapterProgressive = new PlnToEuroAdapter(polandTaxFactory.makeProgressiveTax());

        tax = new Tax(plnToEuroAdapterLinear);
        System.out.println("Poland in Euro Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(plnToEuroAdapterProgressive);
        System.out.println("Poland in Euro Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));



        // USA

        System.out.println("\nUsa in euro");
        UsdToEuroAdapter usdToEuroAdapterLinear = new UsdToEuroAdapter(usaTaxFactory.makeLinearTax());
        UsdToEuroAdapter usdToEuroAdapterProgressive = new UsdToEuroAdapter(usaTaxFactory.makeProgressiveTax());


        tax = new Tax(usdToEuroAdapterLinear);
        System.out.println("USA in Euro Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(usdToEuroAdapterProgressive);
        System.out.println("USA in Euro Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));


        // France

        System.out.println("\nFrance in euro");

        tax = new Tax(franceTaxFactory.makeLinearTax());
        System.out.println("France in Euro Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(franceTaxFactory.makeProgressiveTax());
        System.out.println("France in Euro Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));

        // German

        System.out.println("\nGerman in euro");
        tax = new Tax(germanyTaxFactory.makeLinearTax());
        System.out.println("German in Euro Linear: " + Rounder.round(m1.getValueWithAppliedTax(tax)));
        tax = new Tax(germanyTaxFactory.makeProgressiveTax());
        System.out.println("German in Euro Progressive: " + Rounder.round(m1.getValueWithAppliedTax(tax)));

    }
}

package items;

public class Book extends Item{
    private int symbol;

    public Book() {}

    public Book(int year, int symbol) {
        super(year);
        this.symbol = symbol;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    @Override
    public double calculateValue() {
        double value  = ((double)(2050 - this.getYear())/(this.getSymbol()));
        this.setPrice(value);

        return value;
    }


}

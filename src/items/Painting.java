package items;

public class Painting extends Item {



    public Painting(int year) {
        super(year);
    }

    @Override
    public double calculateValue() {
        double value = ((2100 - this.getYear()) * 10);
        this.setPrice(value);

        return value;
    }
}

package items;

public class Sculpture extends Item {
    private double size;


    public Sculpture(int year, double size) {
        super(year);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double calculateValue() {
        double value = ((2020 - this.getYear()) * this.size * 2);
        this.setPrice(value);

        return value;
    }
}

package items;

import items.util.ValueCalc;

public abstract class Item implements ValueCalc {
    private int year;
    private double price;

    public Item() {
    }

    public Item(int year) {
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

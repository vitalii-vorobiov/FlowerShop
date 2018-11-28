package data.flower;

import data.base.Color;

public class Tulip extends Flower {

    public Tulip(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Tulip getRandomTulip() {
        return new Tulip(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}

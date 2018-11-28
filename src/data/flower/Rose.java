package data.flower;

import data.base.Color;

public class Rose extends Flower {

    public Rose(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Rose getRandomRose() {
        return new Rose(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}

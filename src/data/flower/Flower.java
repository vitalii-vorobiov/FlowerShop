package data.flower;

import data.base.Color;

import java.util.Random;

public abstract class Flower {
    protected Color color;
    protected float price;
    protected int length;

    protected static Random random = new Random();

    public Flower(Color color, float price, int length) {
        this.color = color;
        this.price = price;
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public static Color getRandomColor() {
        switch (random.nextInt(3)) {
            case 0: return Color.RED;
            case 1: return Color.GREEN;
            case 2: return Color.BLUE;
        }
        return Color.RED;
    }

    public static float getRandomPrice() {
        return 3 + random.nextFloat() * 10;
    }

    public static int getRandomLength() {
        return (4 + random.nextInt(5)) * 10;
    }


}

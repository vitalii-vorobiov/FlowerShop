import flowers.Flower;
import flowers.

import java.awt.*;


public class Main {

    public static void main(String[] args) {

    Flower flower = new Flower(FlowerType.CHAMOMILE, Color.BLUE, 10, new FlowerSpec());

    FlowerBucket fb = new FlowerBucket();
        for (int i = 0; i < 10; i++) {
            fb.addFlower(flower);
        }

        Order order = new Order();
        order.addFlowerBucker(fb);

        System.out.println();

    }

}

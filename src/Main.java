import data.Storage;
import data.flower.Chamomile;
import data.flower.Rose;
import data.flower.Tulip;
import data.set.Basket;
import data.set.Bouquet;

public class Main {

    public static void main(String[] args) {
        Rose rose = Rose.getRandomRose();
        System.out.println(rose);

        Chamomile chamomile = Chamomile.getRandomChamolite();
        System.out.println(chamomile);

        Tulip tulip = Tulip.getRandomTulip();
        System.out.println(tulip);

        Basket basket = Basket.getRandomBasket();
        System.out.println(basket);

        Bouquet bouquet = Bouquet.getRandomBouquet();
        System.out.println(bouquet);

        Storage storage = new Storage();
        storage.addRandomData();
        System.out.println(storage);


    }
}

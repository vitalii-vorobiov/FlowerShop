package flowers;

import lombok.Getter;
import lombok.Setter;
import payments.PayWay;

import java.util.ArrayList;


public class Order {
    @Getter
    private ArrayList<FlowerBucket> fbs;
    @Getter @Setter
    private PayWay payWay;
    @Getter @Setter
    private DeliveryWay deliveryWay;

    public Order() {
        fbs = new ArrayList<FlowerBucket>();
    }

    public boolean peocess() {

    }

    public double getPrice() {
        double price = 0;
        for (FlowerBucket fb: fbs) {
            price += fb.getPrice();
        }

        return price;
    }
}

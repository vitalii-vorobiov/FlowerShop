package payments;

public class Privat24Pay implements PayWay {
    @Override
    public boolean pay() {
        System.out.println("Paid with Privat24...");
        return true;
    }
}

package flowers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlowerSpec {

    private FlowerColor color;
    private double price;
    private FlowerSmell smell;
    private Country country;

}

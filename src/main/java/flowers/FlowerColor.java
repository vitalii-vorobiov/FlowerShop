package flowers;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum FlowerColor {
    RED("Red", "#ff0000"),
    GREEN("Green", "#00ff00"),
    BLUE("Blue", "#0000ff"),
    YELLOW("Yellow", "#ffff00"),
    WHITE("White", "#ffffff"),
    BLACK("Black", "#000000");

    private final String name;
    private final String code;

    FlowerColor(String name, String code) {
        this.name =  name;
        this.code = code;
    }
}

package factory;

public class ChocolateFactory extends CandyFactory {

    @Override
    public Candy getCandy(String type) {
        return switch (type) {
            case "dark" -> new ChocolateDark();
            case "milk" -> new ChocolateMilk();
            default -> null;
        };
    }
}

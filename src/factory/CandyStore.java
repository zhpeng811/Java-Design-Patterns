package factory;

import java.util.ArrayList;

public class CandyStore {
    private static final CandyFactory chocolateFactory = new ChocolateFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(7, "dark");
    }

}

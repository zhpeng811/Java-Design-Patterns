package factory;

import java.util.ArrayList;

public class ChocolateMilk extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolateMilkPackage = new ArrayList<>();
        for(int i = 0; i < quantity; i++) {
            ChocolateMilk chocolateMilk = new ChocolateMilk();
            chocolateMilkPackage.add(chocolateMilk);
        }

        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolateMilkPackage;
    }
}
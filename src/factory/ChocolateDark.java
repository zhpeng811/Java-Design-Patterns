package factory;

import java.util.ArrayList;

public class ChocolateDark extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolateDarkPackage = new ArrayList<>();
        for(int i = 0; i < quantity; i++) {
            ChocolateDark chocolateDark = new ChocolateDark();
            chocolateDarkPackage.add(chocolateDark);
        }

        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolateDarkPackage;
    }
}

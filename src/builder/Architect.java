package builder;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        BedRoom room = new RoomBuilder()
                .setDimensions(new Dimension(200, 100))
                .setCeilingHeight(3)
                .createBedRoom();
    }

}

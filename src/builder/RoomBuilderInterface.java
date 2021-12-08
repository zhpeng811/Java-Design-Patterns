package builder;

import java.awt.*;

public interface RoomBuilderInterface {
    RoomBuilderInterface setDimensions(Dimension dimensions);

    RoomBuilderInterface setCeilingHeight(int ceilingHeight);

    RoomBuilderInterface setFloorNumber(int floorNumber);

    RoomBuilderInterface setWallColor(Color wallColor);

    RoomBuilderInterface setNumberOfWindows(int numberOfWindows);

    RoomBuilderInterface setNumberOfDoors(int numberOfDoors);
}

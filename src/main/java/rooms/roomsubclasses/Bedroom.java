package rooms.roomsubclasses;

import rooms.Room;
import rooms.RoomType;

import java.util.ArrayList;

public class Bedroom extends Room {

    public Bedroom(RoomType roomType, int roomNumber, ArrayList bookedGuests) {
        super(roomType, roomNumber, bookedGuests);
    }
}

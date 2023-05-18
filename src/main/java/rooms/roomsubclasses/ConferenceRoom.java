package rooms.roomsubclasses;

import rooms.Room;
import rooms.RoomType;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    public ConferenceRoom(RoomType roomType, int roomNumber, ArrayList bookedGuests) {
        super(roomType, roomNumber, bookedGuests);
    }
}

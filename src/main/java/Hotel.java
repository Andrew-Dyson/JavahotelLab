import guests.Guest;
import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;

    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGuest(Guest guest, Room room) {
        room.bookGuest(guest);
    }



}

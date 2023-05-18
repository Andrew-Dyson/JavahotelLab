package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private int roomNumber;

    private ArrayList<Guest> bookedGuests;

    public Room(RoomType roomType, int roomNumber, ArrayList<Guest> bookedGuests) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bookedGuests = new ArrayList<>();
    }
    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomCapacity() {
        return this.roomType.getValue();
    }

    public void bookGuest(Guest guest) {
        bookedGuests.add(guest);
    }

    public int getCurrentBookedGuests(){
        return bookedGuests.size();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}


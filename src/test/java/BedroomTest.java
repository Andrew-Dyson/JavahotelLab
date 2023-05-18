import org.junit.Before;
import org.junit.Test;
import guests.Guest;
import rooms.RoomType;
import rooms.roomsubclasses.Bedroom;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("Clive");
        bedroom = new Bedroom(RoomType.DOUBLE, 10, new ArrayList<>());
    }
    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        bedroom.bookGuest(guest1);
        assertEquals(1, bedroom.getCurrentBookedGuests());
    }

}

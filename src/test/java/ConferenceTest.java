import org.junit.Before;
import org.junit.Test;
import guests.Guest;
import rooms.RoomType;
import rooms.roomsubclasses.ConferenceRoom;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    ConferenceRoom conferenceroom1;
    Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("Clive");
        conferenceroom1 = new ConferenceRoom(RoomType.CONFERENCE, 22, new ArrayList<>());
    }
    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.CONFERENCE, conferenceroom1.getRoomType());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(15, conferenceroom1.getRoomCapacity());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        conferenceroom1.bookGuest(guest1);
        assertEquals(1, conferenceroom1.getCurrentBookedGuests());
    }

}
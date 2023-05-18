import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.RoomType;
import rooms.roomsubclasses.Bedroom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    Bedroom bedroom1;

    Guest guest1;



    @Before
    public void before(){
        hotel = new Hotel("Quantocks Hotel");
        bedroom1 = new Bedroom(RoomType.DOUBLE, 10, new ArrayList<>());
        guest1 = new Guest("Clive");
    }

    @Test
    public void hotelHasAName(){
        assertEquals("Quantocks Hotel", hotel.getName());
    }


    @Test
    public void hotelCanCheckInAGuest(){
        bedroom1.bookGuest(guest1);
        assertEquals(1, bedroom1.getCurrentBookedGuests());
    }
}

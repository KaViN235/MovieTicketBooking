package MovieTicketBooking;
import java.util.*;
class Theater_Details {
    private int capacity;
    private ArrayList<String> seats;

    public Theater_Details(int capacity) {
        this.capacity = capacity;
        seats = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            seats.add(String.valueOf(i));
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<String> getAvailableSeats() {
        return seats;
    }

    public void bookSeat(String seatNumber) {
        seats.remove(seatNumber);
    }
}



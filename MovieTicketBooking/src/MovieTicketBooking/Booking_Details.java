package MovieTicketBooking;
public class Booking_Details {
	    private Movie_Detail movie;
	    private Theater_Details theater;
	    private String seatNumber;

	    public Booking_Details(Movie_Detail movie, Theater_Details theater, String seatNumber) {
	        this.movie = movie;
	        this.theater = theater;
	        this.seatNumber = seatNumber;
	    }

	    public Movie_Detail getMovie() {
	        return movie;
	    }

	    public Theater_Details getTheater() {
	        return theater;
	    }

	    public String getSeatNumber() {
	        return seatNumber;
	    }
}

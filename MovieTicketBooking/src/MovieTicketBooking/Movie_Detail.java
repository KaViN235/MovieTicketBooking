package MovieTicketBooking;

public class Movie_Detail {
	    private String title;
	    private String genre;
	    private int duration;

	    public Movie_Detail(String title, String genre, int duration) {
	        this.title = title;
	        this.genre = genre;
	        this.duration = duration;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    public int getDuration() {
	        return duration;
	    }
	}

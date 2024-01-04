
package MovieTicketBooking;
import java.util.*;
public class MovieTicketBooking {
	    public static void main(String[] args) {
	        ArrayList<Movie_Detail> movies = new ArrayList<>();
	        movies.add(new Movie_Detail("Movie 1", "Action", 120));
	        movies.add(new Movie_Detail("Movie 2", "Comedy", 100));

	        ArrayList<Theater_Details > theaters = new ArrayList<>();
	        theaters.add(new Theater_Details (50));
	        theaters.add(new Theater_Details (30));

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Book your Ticket...");
	            System.out.println("1.Show Movies");
	            System.out.println("2.Book a Ticket");
	            System.out.println("3.Exit");
	            
	            System.out.print("Enter your choice: "); 
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("                Available Movies:");
	                    for (Movie_Detail movie : movies) 
	                    {
	                        System.out.println(movie.getTitle());
	                    }
	                    break;
	                case 2:
	                    System.out.print("                 Enter movie title: ");
	                    scanner.nextLine();
	                    String selectedMovie = scanner.nextLine();
	                    Movie_Detail chosenMovie = null;
	                    for (Movie_Detail movie : movies)
	                    {
	                        if (movie.getTitle().equalsIgnoreCase(selectedMovie)) 
	                        {
	                            chosenMovie = movie;
	                            break;
	                        }
	                    }

	                    if (chosenMovie == null) 
	                    {
	                        System.out.println("Movie not found.");
	                        continue;
	                    }

	                    System.out.print("Enter theater number (1 or 2): ");
	                    int theaterNumber = scanner.nextInt();
	                    Theater_Details  chosenTheater = theaters.get(theaterNumber - 1);

	                    System.out.print("Available seats: ");
	                    System.out.println(chosenTheater.getAvailableSeats());

	                    System.out.print("Enter seat number : ");
	                    String seatNumber = scanner.next();
	                    if (!chosenTheater.getAvailableSeats().contains(seatNumber))
	                    {
	                        System.out.println("Seat is not available.");
	                        continue;
	                    }

	                    chosenTheater.bookSeat(seatNumber);
	                    Booking_Details booking = new Booking_Details(chosenMovie, chosenTheater, seatNumber);

	                    System.out.println("Booking successful:");
	                    System.out.println("Movie: " + booking.getMovie().getTitle());
	                    System.out.println("Theater: " + (theaterNumber));
	                    System.out.println("Seat: " + booking.getSeatNumber());
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the Movie Ticket Booking \n      Welcome at any time..");
	                    scanner.close();
	                    System.exit(0);
	                    
	                default:
	                    System.out.println("Sorry!!!!!! Invalid choice.Please try again.");
	            }
	        }
	    }
}

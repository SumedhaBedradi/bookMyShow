import java.util.Date;
public class Show {
   private static int idCounter = 0;
	private int id;
	private Date showTime;
	private Movie movie;
	private Theater theater;
	private int availableSeats;

	public Show(Date showTime, Movie movie, Theater theater) {
		idCounter += 1;
		this.id = idCounter;
		this.showTime = showTime;
		this.movie = movie;
		this.theater = theater;
		this.availableSeats = theater.getCapacity();
		theater.getShows().add(this);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void updateShow() {
	}
}

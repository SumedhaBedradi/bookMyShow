import java.util.ArrayList;

public class Theater {
    private static int idCounter = 0;
	private int id;
	private String name;
	private String location;
	private int capacity;
	private ArrayList<Show> shows;

	public Theater(String name, String location, int capacity) {
		idCounter += 1;
		this.id = idCounter;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.shows = new ArrayList<>();
	}
}

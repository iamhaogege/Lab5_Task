package lab5_Task5;


public class RoomSchedule {
	private Movie[] movieRoom; 
	int a=0;
	public RoomSchedule() {
		movieRoom = new Movie[6];
	}
	public boolean addMovie(Movie b){
		
		if(movieRoom != null) {
		this.movieRoom[a] = b;
		return true;
		}
		else {
			return false;
		}
		
	}
	public Movie getMovie(int c) {
		if(c < movieRoom.length && c >= 0) {
			return movieRoom[c];
		}
		else {
		return null;
		}
	}
}

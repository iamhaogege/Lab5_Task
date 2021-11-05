package lab5_Task5;
import java.lang.reflect.Method;
public class MovieTheatre {
	private String location;
	private int openingHours;
	private int roomsNum;
	RoomSchedule[] RoomSchedule;
	
	public MovieTheatre(String location,int roomsNum) {
		this.location=location;
		this.roomsNum=roomsNum;
		RoomSchedule=new RoomSchedule[this.roomsNum];
		for(int i = 0;i < RoomSchedule.length;i ++) {
			RoomSchedule[i] = new RoomSchedule(); 
		}
	}
	public int getRoomNum() {
		return roomsNum;
	}
	public boolean addMovieToRoomSchedule(int roomsNum,Movie movie) {
		this.roomsNum=roomsNum;
		if(this.roomsNum <= roomsNum || movie == null) {
			return RoomSchedule[roomsNum].addMovie(movie);
		}else {
			return false;
		}
		}
	public Movie GetMovieFromRoomSchedule(int roomsNum,int moviesNum) {
		roomsNum -= 1;
		moviesNum -= 1;
		if(roomsNum<=this.roomsNum||(RoomSchedule[roomsNum].getMovie(moviesNum))!=null) {
			return RoomSchedule[roomsNum].getMovie(moviesNum);
		}else {
			return null;
		}
	}
	public int getOpeningHours() {
		return openingHours;
	}
		public void setOpeningHours(int openingHours) {
		this.openingHours=openingHours;
	}
	public String toString() {
		return location + "("+ roomsNum + ")";
}	
	public void setLocation(String location) {
		this.location = location;
	}



}

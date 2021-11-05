package lab5_Task5;

public class Movie {
	RoomSchedule[] RoomSchedule;
	private String name;
	private double adultprice;
	private double childprice;
	private int duration;

	public Movie(String name,int duration) {
		this.name=name;
		this.duration=duration;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDuration(int duration) {
		this.duration= duration;
	}
	public String toString() {
		return name + "(" + duration + "minutes)";

	}

}

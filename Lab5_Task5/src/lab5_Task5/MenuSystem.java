package lab5_Task5;

import java.util.*;

public class MenuSystem {
	RoomSchedule[] RoomSchedule;
	private int chooseRoomNum;
	private Movie movie;
	private MovieTheatre movieTheatre;
	private Scanner i = new Scanner(System.in);
  
	
	public int chooseRoom() {
		  int chooseRoomNum;
		  System.out.println(movieTheatre.getRoomNum()+"rooms already in");
		  do {chooseRoomNum=i.nextInt();}while(chooseRoomNum<=0);
		  return chooseRoomNum;}
	public MenuSystem() {
    	  super();
    	 }
	public MenuSystem(MovieTheatre movieTheatre) {
    	  super();
    	  this.movieTheatre = movieTheatre;
    	 }
	public void runMenu() {
		int chooseNum;
		do {
				System.out.println("enter");
				System.out.println("1. Create a MovieTheatre");
				System.out.println("2. Create a Movie ");
			    System.out.println("3. Select a RoomSchedule to make it ¡®current¡¯ "); 
		    	System.out.println("4. Add Movie "); 
				System.out.println("5. Display current RoomSchedule ");  
				System.out.println("0. Quit Program");
				chooseNum = i.nextInt();
				if(chooseNum<0&&chooseNum>6) {
					System.out.println("enter 1-5:");
				}
				if(chooseNum==0) {
					System.out.println("End");
				}
				switch(chooseNum) {
				case 1: 
					System.out.println("enter cinema adds:");
					System.out.println("enter the Num:");
					obtainTheatreDetails();
					break;
				case 2:
					System.out.println("enter movie name:");
					System.out.println("enter the movie duration:");
					movie=obtainMovieDetails();
					break;
				case 3:
					System.out.println("select a room:");
					chooseRoomNum=chooseRoom();
					break;
				case 4:
					System.out.println(chooseRoomNum=chooseRoom());
					break;
				case 5:
					for(int i = 0;i <= 6;i++) {
						System.out.println("The"+i+"movie is"+movieTheatre.GetMovieFromRoomSchedule(chooseRoomNum, i)+"in the"+chooseRoomNum+"room.");
					}
					break;
				
				}
				
				
			}while(!(chooseNum==0));
		}
	public void obtainTheatreDetails() {
		  String add=i.next();
		  int roomNum=i.nextInt();
		  movieTheatre=new MovieTheatre(add,roomNum);
		 }
	public Movie obtainMovieDetails() {
		  String movieName=i.next();
		  int movieTime=i.nextInt();
		  Movie movie = new Movie(movieName,movieTime);
		  return movie;
		 }


}


	
	


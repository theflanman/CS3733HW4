package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IRoom;

public class Room implements IRoom {

	protected static int roomNum;
	protected static int maxPeople; // max # of people in this Room
	protected static int computerNum; // number of computers in this Room
	protected static String seatLayout;
	protected static boolean hasWhiteboard;
	protected static boolean isTiered;
	
	protected static DeskType deskType;
	protected static ComputerType computerType;
	
	// constructor
	public Room(int roomNum, int maxPeople, String seatLayout,
			boolean hasWhiteboard, DeskType deskType, ComputerType computerType) {
		
		Room.roomNum = roomNum;
		Room.maxPeople = maxPeople;
		Room.computerNum = computerNum;
		Room.seatLayout = seatLayout;
		Room.hasWhiteboard = hasWhiteboard;
		Room.deskType = deskType;
		Room.computerType = computerType;
	}

	@Override
	public int roomSize() {
		return Room.maxPeople;
	}

	@Override
	public boolean isClassroom() {
		if(Room.maxPeople >= 15 && Room.maxPeople <= 60){
			if(! Room.seatLayout.equals("tiered")){
				if(Room.hasWhiteboard){
					if(computerNum == 0)
						return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean isLectureHall() {
		if(Room.maxPeople >= 61 && Room.maxPeople <= 200){
			if(Room.seatLayout.equals("tiered")){
				if(computerNum == 0)
					return true;
			}
		}

		return false;
	}

	@Override
	public boolean isComputerLab() {
		if(Room.maxPeople >= 25 && Room.maxPeople <= 40){
			if(! Room.seatLayout.equals("tiered")){
				if(computerNum > 0)
					return true;
			}
		}

		return false;
	}

	@Override
	public String getType() {
		if(this.isClassroom())
			return "Classroom";
		else if(this.isLectureHall())
			return "Lecture Hall";
		else if(this.isComputerLab())
			return "Computer Lab";

		return null;
	}
	
	public Room getRoom(String roomType) {
		if(roomType.equals("Classroom"))
			return new Classroom();
		else if(roomType.equals("Lecture Hall"))
			return new LectureHall();
		else if(roomType.equals("Computer Lab"))
			return new ComputerLab();
		
		return null;
	}

	@Override
	public int getRoomNumber() {
		return Room.roomNum;
	}

}

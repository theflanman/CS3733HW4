package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IRoom;

public class Room implements IRoom {

	protected int roomNum;
	protected int maxPeople; // max # of people in this Room
	protected int computerNum; // number of computers in this Room
	protected String seatLayout;
	protected boolean hasWhiteboard;
	
	protected DeskType deskType;
	protected ComputerType computerType;
	
	// constructor
	public Room(int roomNum, int maxPeople, String seatLayout,
			boolean hasWhiteboard, DeskType deskType, ComputerType computerType) {
		
		this.roomNum = roomNum;
		this.maxPeople = maxPeople;
		this.computerNum = computerNum;
		this.seatLayout = seatLayout;
		this.hasWhiteboard = hasWhiteboard;
		this.deskType = deskType;
		this.computerType = computerType;
	}
	
	public Room(Room room) {
		this.roomNum = room.roomNum;
		this.maxPeople = room.maxPeople;
		this.computerNum = room.computerNum;
		this.seatLayout = room.seatLayout;
		this.hasWhiteboard = room.hasWhiteboard;
		this.deskType = room.deskType;
		this.computerType = room.computerType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Room testRoom = (Room) obj;
		
		return testRoom.hasWhiteboard == this.hasWhiteboard &&
				testRoom.computerNum == this.computerNum &&
				testRoom.computerType == this.computerType &&
				testRoom.deskType == this.deskType &&
				testRoom.maxPeople == this.maxPeople &&
				testRoom.roomNum == this.roomNum &&
				testRoom.seatLayout == this.seatLayout;
		
	}

	@Override
	public int roomSize() {
		return this.maxPeople;
	}

	@Override
	public boolean isClassroom() {
		if(this.maxPeople >= 15 && this.maxPeople <= 60){
			if(! this.seatLayout.equals("tiered")){
				if(this.hasWhiteboard){
					if(computerNum == 0)
						return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean isLectureHall() {
		if(this.maxPeople >= 61 && this.maxPeople <= 200){
			if(this.seatLayout.equals("tiered")){
				if(computerNum == 0)
					return true;
			}
		}

		return false;
	}

	@Override
	public boolean isComputerLab() {
		if(this.maxPeople >= 25 && this.maxPeople <= 40){
			if(! this.seatLayout.equals("tiered")){
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
	
	@Override
	public int getRoomNumber() {
		return this.roomNum;
	}

}

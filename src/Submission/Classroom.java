package Submission;

import DontChange.*;

public class Classroom implements IClassroom {
	
	private int roomNumber;
	private DeskType deskType;
	
	public int roomSize() {
		return 60;
	}

	public boolean isClassroom() {
		return true;
	}

	public boolean isLectureHall() {
		return false;
	}

	public boolean isComputerLab() {
		return false;
	}

	public String getType() {
		return "Classroom";
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public DeskType getDeskType() {
		return this.deskType;
	}

	public void setDeskType(DeskType type) {
		this.deskType = type;		
	}

}

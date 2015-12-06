package Submission;

import DontChange.*;

public class Classroom extends Room implements IClassroom {
		
	public Classroom(int roomNum, int maxPeople, String seatLayout,
			boolean hasWhiteboard, DeskType deskType, ComputerType computerType) {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}

	public Classroom(Room room) {
		super(room);
	}

	public DeskType getDeskType() {
		return this.deskType;
	}

	public void setDeskType(DeskType type) {
		this.deskType = type;		
	}

}

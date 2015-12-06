package Submission;

import DontChange.*;

public class Classroom extends Room implements IClassroom {
		
	public Classroom() {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}

	public DeskType getDeskType() {
		return Classroom.deskType;
	}

	public void setDeskType(DeskType type) {
		Classroom.deskType = type;		
	}

}

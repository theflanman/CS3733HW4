package Submission;

import DontChange.*;

public class LectureHall extends Room implements ILectureHall {
	
	public LectureHall() {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}

	@Override
	public DeskType getDeskType() {
		return LectureHall.deskType;
	}

	@Override
	public void setDeskType(DeskType deskType) {
		LectureHall.deskType = deskType;
	}

}

package Submission;

import DontChange.*;

public class LectureHall extends Room implements ILectureHall {
	
	public LectureHall(int roomNum, int maxPeople, String seatLayout,
			boolean hasWhiteboard, DeskType deskType, ComputerType computerType) {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}

	public LectureHall(Room room) {
		super(room);
	}

	@Override
	public DeskType getDeskType() {
		return this.deskType;
	}

	@Override
	public void setDeskType(DeskType deskType) {
		this.deskType = deskType;
	}

}

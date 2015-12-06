package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IComputerLab;

public class ComputerLab extends Room implements IComputerLab {

	public ComputerLab(int roomNum, int maxPeople, String seatLayout,
			boolean hasWhiteboard, DeskType deskType, ComputerType computerType) {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}
	
	public ComputerLab(Room room) {
		super(room);
	}

	@Override
	public ComputerType getComputerType() {
		return this.computerType;
	}

	@Override
	public void setComputerType(ComputerType computerType) {
		this.computerType = computerType;
	}

}

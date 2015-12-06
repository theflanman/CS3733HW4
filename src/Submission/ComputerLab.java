package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IComputerLab;

public class ComputerLab extends Room implements IComputerLab {

	public ComputerLab() {
		super(roomNum, maxPeople, seatLayout, hasWhiteboard, deskType, computerType);
	}

	@Override
	public ComputerType getComputerType() {
		return ComputerLab.computerType;
	}

	@Override
	public void setComputerType(ComputerType computerType) {
		ComputerLab.computerType = computerType;
	}

}

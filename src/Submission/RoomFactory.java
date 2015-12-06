package Submission;

public class RoomFactory {

	public static Room getRoom(String roomType) {
		if(roomType.equals("Classroom"))
			return new Classroom();
		else if(roomType.equals("Lecture Hall"))
			return new LectureHall();
		else if(roomType.equals("Computer Lab"))
			return new ComputerLab();
		
		return null;
	}
}

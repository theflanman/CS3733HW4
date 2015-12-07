package Submission;

public class RoomFactory {
	
	public static Room getRoom(Room room) {
		
		if(room.getType() == null) {
			return new Room(room);
		}

		if(room.getType().equals("Classroom")) {
			return new Classroom(room);
		}
		else if(room.getType().equals("Lecture Hall")) {
			return new LectureHall(room);
		}
		else if(room.getType().equals("Computer Lab")) {
			return new ComputerLab(room);
		}
		
		return room; 
		
	}

}

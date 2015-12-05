package DontChange;

public interface IRoom {
	
	/**
	 * How many people can be in the room at once.
	 * @return The number of people that can be in the room.
	 */
	int roomSize();
	
	/**
	 * Determines whether the room qualifies as a classroom or not.
	 * @return True if the room is a classroom, false otherwise.
	 */
	boolean isClassroom();
	
	/**
	 * Determines whether the room qualifies as a lecture hall or not.
	 * @return True if the room is a lecture hall, false otherwise.
	 */
	boolean isLectureHall();
	
	/**
	 * Determines whether or not the room is a computer lab.
	 * @return True if the room is a computer lab, false otherwise.
	 */
	boolean isComputerLab();
	
	/**
	 * The string, human readable representation of the room.
	 * @return "Lecture Hall" if room is a lecture hall, "Classroom" if room is a classroom, etc.
	 */
	String getType();
	
	/**
	 * Gets the room number of the room.
	 * @return The room number of the room. 
	 */
	int getRoomNumber();
}

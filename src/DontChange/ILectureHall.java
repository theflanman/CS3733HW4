package DontChange;

public interface ILectureHall extends IRoom {
	/**
	 * Gets the type of desk contained in the room.
	 * @return The type of desk. 
	 */
	DeskType getDeskType();
	
	/**
	 * Sets the type of desk in the room.
	 * @param t The DeskType in the room.
	 */
	void setDeskType(DeskType t);
}

package DontChange;

public interface IComputerLab extends IRoom {
	
	/**
	 * Gets the type of computer contained in the room.
	 * @return The type of computer. 
	 */
	ComputerType getComputerType();
	
	/**
	 * Sets the type of computer in the room.
	 * @param t The ComputerType in the room.
	 */
	void setComputerType(ComputerType t);
}

package DontChange;
import java.util.Collection;

public interface IBuilding {
	/**
	 * Get all the rooms in the building.
	 * @return Collection containing all the rooms in the building.
	 */
	Collection<IRoom> getRooms();
	
	/**
	 * Add a room to the building.
	 * @param newRoom The room to be added.
	 */
	void addRoom(IRoom newRoom);
	
	/**
	 * Gets all the classrooms in the building.
	 * @return The list of all classrooms.
	 */
	Collection<IClassroom> getClassrooms();
	
	/**
	 * Gets all the lecture halls in the building.
	 * @return The list of all lecture halls.
	 */
	Collection<ILectureHall> getLectureHalls();
	
	/**
	 * Gets all the Computer Labs in the building.
	 * @return The list of all computer labs.
	 */
	Collection<IComputerLab> getComputerLabs();
}

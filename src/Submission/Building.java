package Submission;

import java.util.ArrayList;
import java.util.Collection;

import DontChange.IBuilding;
import DontChange.IClassroom;
import DontChange.IComputerLab;
import DontChange.ILectureHall;
import DontChange.IRoom;

public class Building implements IBuilding{
	
	ArrayList<IRoom> rooms;	

	public Collection<IRoom> getRooms() {
		return this.rooms;
	}

	public void addRoom(IRoom newRoom) {
		this.rooms.add(newRoom);
		
	}

	public Collection<IClassroom> getClassrooms() {
		
		Collection<IClassroom> classRooms = new ArrayList<IClassroom>();
		IRoom[] roomArray = (IRoom[]) this.rooms.toArray();
		
		for (int i = 0; i < this.rooms.size(); i++) {
			if (roomArray[i].getType() == "Classroom") {
				
				classRooms.add((IClassroom) roomArray[i]);
				
			}
		}
		
		return classRooms;
	}

	public Collection<ILectureHall> getLectureHalls() {
		
		Collection<ILectureHall> lectureHalls = new ArrayList<ILectureHall>();
		IRoom[] roomArray = (IRoom[]) this.rooms.toArray();
		
		for (int i = 0; i < this.rooms.size(); i++) {
			if (roomArray[i].getType() == "Lecture Hall") {
				
				lectureHalls.add((ILectureHall) roomArray[i]);
				
			}
		}
		
		return lectureHalls;
	}

	@Override
	public Collection<IComputerLab> getComputerLabs() {
		
		Collection<IComputerLab> computerLabs = new ArrayList<IComputerLab>();
		IRoom[] roomArray = (IRoom[]) this.rooms.toArray();
		
		for (int i = 0; i < this.rooms.size(); i++) {
			if (roomArray[i].getType() == "Computer Lab") {
				
				computerLabs.add((IComputerLab) roomArray[i]);
				
			}
		}
		
		return computerLabs;
	}

}

package Submission;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import DontChange.*;

public class MainTest {

	@Test
	public void classroomTest() {

		Room room114 = new Room(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		room114 = RoomFactory.getRoom(room114);
		
		Classroom cRoom114 = new Classroom(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		
		assertEquals(room114.getType(), cRoom114.getType());
		
		assertEquals(room114, cRoom114);
		
		assertEquals(room114.roomSize(), 35);
		
		assertEquals(room114.isClassroom(), true);
		
		assertEquals(room114.isComputerLab(), false);
		
		assertEquals(room114.isLectureHall(), false);
		
		assertEquals(room114.getType(), "Classroom");
		
		assertEquals(room114.getRoomNumber(), 114);
		
	}
	
	@Test
	public void lectureHallTest() {
		
		Room room116 = new Room(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		room116 = RoomFactory.getRoom(room116);
		
		LectureHall cRoom116 = new LectureHall(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		
		assertEquals(room116.getType(), cRoom116.getType());
		
		assertEquals(room116, cRoom116);
		
		assertEquals(room116.isLectureHall(), true);
		
		assertEquals(room116.getType(), "Lecture Hall");
		
		assertEquals(room116.getRoomNumber(), 116);
		
	}
	
	@Test
	public void computerLabTest() {
		
		Room room230 = new Room(230, 40, "non-tiered", true, null, ComputerType.WINDOWS);
		room230 = RoomFactory.getRoom(room230);
		
		ComputerLab cRoom230 = new ComputerLab(230, 40, "non-tiered", true, null, ComputerType.WINDOWS);
		
		assertEquals(room230.getType(), cRoom230.getType());
		
		assertEquals(room230, cRoom230);
		
		assertEquals(room230.isComputerLab(), true);
		
		assertEquals(room230.getType(), "Computer Lab");
		
		assertEquals(room230.getRoomNumber(), 230);
		
	}
	
	public void deskTest() {
		
		LectureHall room = new LectureHall(0, 90, "tiered", false, DeskType.LONGTABLES, null);
		
		Classroom otherRoom = new Classroom(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		
		assertEquals(room.getDeskType(), DeskType.LONGTABLES);
		
		assertEquals(otherRoom.getDeskType(), DeskType.SWINGOUT);
		
	}
	
	public void computerTest() {
		
		ComputerLab lab = new ComputerLab(230, 40, "non-tiered", true, null, ComputerType.WINDOWS);
		
		assertEquals(lab.getComputerType(), ComputerType.WINDOWS);
		
	}
	
	public void buildingTest() {
		
		Building higgins = new Building();

		Room room114 = new Room(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		room114 = RoomFactory.getRoom(room114);
		higgins.addRoom(room114);
		
		Room room116 = new Room(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		room116 = RoomFactory.getRoom(room116);
		higgins.addRoom(room116);

		Room room202 = new Room(202, 35, "non-tiered", true, DeskType.LONGTABLES, null);
		room202 = RoomFactory.getRoom(room202);
		higgins.addRoom(room202);

		Room room218 = new Room(218, 90, "tiered", false, DeskType.LONGTABLES, null);
		room218 = RoomFactory.getRoom(room218);
		higgins.addRoom(room218);

		Room room230 = new Room(230, 40, "non-tiered", true, null, ComputerType.WINDOWS);
		room230 = RoomFactory.getRoom(room230);
		higgins.addRoom(room230);

		Collection<IRoom> rooms = new ArrayList<IRoom>();
		Collection<IRoom> cRooms = new ArrayList<IRoom>();
		Collection<IRoom> labs = new ArrayList<IRoom>();
		Collection<IRoom> lHalls = new ArrayList<IRoom>();
		
		rooms.add(room114);
		rooms.add(room116);
		rooms.add(room202);
		rooms.add(room218);
		rooms.add(room230);
		
		cRooms.add(room114);
		cRooms.add(room202);
		
		labs.add(room230);
		
		lHalls.add(room116);
		lHalls.add(room218);
		
		assertEquals(higgins.getRooms(), rooms);
		
		assertEquals(higgins.getClassrooms(), cRooms);
		
		assertEquals(higgins.getComputerLabs(), labs);
		
		assertEquals(higgins.getLectureHalls(), lHalls);
		
	}

}

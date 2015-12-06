package Submission;

import static org.junit.Assert.*;

import org.junit.Test;

import DontChange.DeskType;

public class MainTest {

	@Test
	public void classroomTest() {

		Room room114 = new Room(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		room114 = RoomFactory.getRoom(room114);
		
		Classroom cRoom114 = new Classroom(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		
		assertEquals(room114.getType(), cRoom114.getType());
		
		assertEquals(room114, cRoom114);
		
	}
	
	@Test
	public void lectureHallTest() {
		
		Room room116 = new Room(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		room116 = RoomFactory.getRoom(room116);
		
		LectureHall cRoom116 = new LectureHall(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		
		assertEquals(room116.getType(), cRoom116.getType());
		
		assertEquals(room116, cRoom116);
		
	}
	
	@Test
	public void computerLabTest() {
		
		
		
	}

}

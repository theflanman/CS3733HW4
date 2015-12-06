package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IBuilding;

public class Main {
	public static IBuilding createHiggins(){
		Building higgins = new Building();

		Room room114 = new Room(114, 35, "non-tiered", true, DeskType.SWINGOUT, null);
		room114 = RoomFactory.getRoom(room114.getType());
		higgins.addRoom(room114);
		
		Room room116 = new Room(116, 90, "tiered", false, DeskType.LONGTABLES, null);
		room116 = RoomFactory.getRoom(room116.getType());
		higgins.addRoom(room116);

		Room room202 = new Room(202, 35, "non-tiered", true, DeskType.LONGTABLES, null);
		room202 = RoomFactory.getRoom(room202.getType());
		higgins.addRoom(room202);

		Room room218 = new Room(218, 90, "tiered", false, DeskType.LONGTABLES, null);
		room218 = RoomFactory.getRoom(room218.getType());
		higgins.addRoom(room218);

		Room room230 = new Room(230, 40, "non-tiered", true, null, ComputerType.WINDOWS);
		room230 = RoomFactory.getRoom(room230.getType());
		higgins.addRoom(room230);
		
		return higgins;
	}
	
	public static IBuilding createFuller(){
		// Fill in driver code here
		return null;
	}
}
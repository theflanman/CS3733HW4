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
		Building fuller = new Building();
		
		Room room021 = new Room(021, 25, "non-tiered", true, null, ComputerType.WINDOWS);
		room021 = RoomFactory.getRoom(room021.getType());
		fuller.addRoom(room021);
		
		Room room100 = new Room(100, 102, "tiered", false, DeskType.SWINGOUT, null);
		room021 = RoomFactory.getRoom(room100.getType());
		fuller.addRoom(room100);
		
		Room room200 = new Room(200, 196, "tiered", false, DeskType.SWINGOUT, null);
		room200 = RoomFactory.getRoom(room200.getType());
		fuller.addRoom(room200);
		
		Room room222 = new Room(222, 27, "non-tiered", true, null, ComputerType.LINUX);
		room222 = RoomFactory.getRoom(room222.getType());
		fuller.addRoom(room222);
		
		Room room311 = new Room(311, 38, "non-tiered", true, DeskType.LONGTABLES, null);
		room021 = RoomFactory.getRoom(room311.getType());
		fuller.addRoom(room311);
		
		Room room320 = new Room(320, 65, "non-tiered", true, DeskType.SWINGOUT, null);
		room021 = RoomFactory.getRoom(room320.getType());
		fuller.addRoom(room320);
		
		return fuller;
	}
}
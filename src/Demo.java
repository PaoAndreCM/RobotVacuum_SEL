import java.util.ArrayList;

public class Demo {
    public static void main (String[] args) {

        // simulating preconditions for UC4: OperateRobot to work

        // Precondition 1: The rooms and regions already exist
        // setting desired number of rooms and regions
        int noOfRegionsColumns = 4;
        int noOfRegionsRows = 2;

        // adding Regions to container availableRegions
        ArrayList<Region> availableRegions = new ArrayList<>();
        for (int i = 0; i < noOfRegionsColumns; i++) {
            for (int j = 0; j < noOfRegionsRows; j++) {
                availableRegions.add(new Region(i, j));
            }
        }

        Room room1 = new Room(new ArrayList<Region>(), 1);
        Room room2 = new Room(new ArrayList<Region>(), 2);
        Room room3 = new Room(new ArrayList<Region>(), 3);
        Room room4 = new Room(new ArrayList<Region>(), 4);

        // Room 1: column(0-half) row(0-half)
        // Room 2: column(half+1 to end) row(0 to half)
        // Room 3: column(0-half) row (half+1 to end)
        // Room 4: column (half+1 to end) row (half+1 to end)

        // adding Regions to rooms
        for (Region r: availableRegions){
            int rColumn = r.getColumn();
            int rRow = r.getRow();
            if (rColumn < noOfRegionsColumns/2 && rRow < noOfRegionsRows/2){
                room1.addRegionToRoom(r);
            } else if (rColumn >= noOfRegionsColumns/2 && rRow < noOfRegionsRows/2){
                room2.addRegionToRoom(r);
            } else if (rColumn < noOfRegionsColumns/2){
                room3.addRegionToRoom(r);
            } else {
                room4.addRegionToRoom(r);
            }
        }

        // adding Rooms to container availableRooms
        ArrayList<Room> availableRooms = new ArrayList<>();
        availableRooms.add(room1);
        availableRooms.add(room2);
        availableRooms.add(room3);
        availableRooms.add(room4);

        // Precondition 2: Instances of GUI and RobotBoundary already exist
        GUI gui = new GUI();
        RobotBoundary boundary = new RobotBoundary();

        // Testing: user selects AutoMode
        AutoMode autoMode = new AutoMode(boundary, gui);
        autoMode.execute();

       //gui.printRegions(availableRegions);
       //gui.printRooms(availableRooms);

        // Testing: user selects RegionsMode
        RegionsMode regionsMode = new RegionsMode(boundary, gui, availableRegions);
        regionsMode.execute();
        // TODO write code to simulate user selecting regions

        // Testing: user selects RoomsMode
        RoomsMode roomsMode = new RoomsMode(boundary, gui, availableRooms);
        roomsMode.execute();
        // TODO write code to simulate user selecting rooms

        // TODO implement giveMeRegions and giveMeRooms in class GUI
        // they must scan for user input
        // they return the selected Regions or Rooms to respective controller

        // TODO finish execute statement in RegionsMode and RoomsMode
        // it receives the regions/rooms and passes them to the RobotBoundary
        // RobotBoundary prints them as proof that they will get sent to actual robot
        // Do I need to create another class Job which is serializable?

    }
}

import java.util.ArrayList;

public class RobotBoundary {
    public void startAuto() {
        System.out.println("Auto Mode will be executed");
    }

    public void startRegionsMode(ArrayList<Region> cleanTheseRegions){
        System.out.println("The following regions will be cleaned");

        for (Region r:cleanTheseRegions){
            System.out.println("(" + r.getColumn() + "," + r.getRow()+")");
        }
    }

    public void startRoomsMode(ArrayList<Room> cleanTheseRooms){
        System.out.println("The following regions will be cleaned");

        for (Room r:cleanTheseRooms){
            System.out.println(r.getrNumber());
        }
    }
}

import java.util.ArrayList;

public class Room {
    int rNumber;
    private ArrayList<Region> regionsInRoom;
    public Room (ArrayList<Region> regionsInRoom, int rNumber) {
        this.regionsInRoom = regionsInRoom;
        this.rNumber = rNumber;
    }
    public int getrNumber() {
        return rNumber;
    }

    public ArrayList<Region> getRegionsInRoom() {
        return regionsInRoom;
    }
    public void addRegionToRoom(Region region){
        regionsInRoom.add(region);
    }

}

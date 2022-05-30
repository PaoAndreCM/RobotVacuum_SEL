import java.util.ArrayList;

public class GUI {

    public GUI(){

    }
    public void displayRegions(ArrayList<Region> listOfRegions) {
        System.out.println("Please select the region(s) you wish to be cleaned");
        printRegions(listOfRegions);
    }

    private void printRegions(ArrayList<Region> listOfRegions) {
        for (Region r:listOfRegions){
            System.out.println("(" + r.getColumn() + "," + r.getRow()+")");
        }
    }

    public void displayRooms(ArrayList<Room> listOfRooms) {
        System.out.println("Please select the room(s) you wish to be cleaned");
        printRooms(listOfRooms);
    }

    private void printRooms(ArrayList<Room> listOfRooms){
        for (Room r:listOfRooms){
            System.out.println(r.getrNumber());
            printRegions(r.getRegionsInRoom());
        }
    }
    public ArrayList<Region> giveMeRegions() {
        ArrayList<Region> a = new ArrayList<>();
        return a;
    }

    public void giveMeRooms() {
    }
}
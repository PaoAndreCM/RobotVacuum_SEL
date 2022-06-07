import java.util.ArrayList;
import java.util.Scanner;

public class GUI {

    public GUI(){

    }
    public void displayRegions(ArrayList<Region> listOfRegions) {
        System.out.println("Please select the region(s) you wish to be cleaned");
        System.out.println("Type the numbers corresponding to the regions separated by spaces");
        printRegions(listOfRegions);
    }

    private void printRegions(ArrayList<Region> listOfRegions) {
        int selectNum = 1;
        for (Region r:listOfRegions){
            System.out.println(selectNum + " - (" + r.getColumn() + "," + r.getRow()+")");
            selectNum++;
        }
    }

    public void displayRooms(ArrayList<Room> listOfRooms) {
        System.out.println("Please select the room(s) you wish to be cleaned");
        System.out.println("Type the rooms numbers separated by spaces");
        printRooms(listOfRooms);
    }

    private void printRooms(ArrayList<Room> listOfRooms){
        for (Room r:listOfRooms){
            System.out.println(r.getrNumber());
            //printRegions(r.getRegionsInRoom());
        }
    }
    public ArrayList<Region> giveRegions(ArrayList<Region> listOfRegions) {
        ArrayList<Region> regionsToClean = new ArrayList<>();
        regionsToClean = collectRegions(listOfRegions);
        return regionsToClean;
    }

    /* This function is in charge of taking in user input and mapping it to
       the regions that the user wants to choose. Then it passes those regions
       to giveRegions()
    */
    private ArrayList<Region> collectRegions(ArrayList<Region> listOfRegions) {
        Scanner input = new Scanner (System.in);
        // storing the whole like as a string
        String inputLine = input.nextLine();
        // splitting the string by each space
        String[] trimmedInputLine = inputLine.trim().split(" ");
        // declaring integer list to store each string in the line converted to Integer
        ArrayList<Integer> indexRegions = new ArrayList();
        // storing each string in the line converted to Integer
        for (String s:trimmedInputLine) {
            indexRegions.add(Integer.parseInt(s));
        }
        // mapping integers in indexRegions to listOfRegions
        ArrayList<Region> regionsToClean = new ArrayList<>();
        for (int i = 0; i<listOfRegions.size(); i++) {
            for (Integer value:indexRegions) {
                value = value - 1;
                if (i == value){
                    regionsToClean.add(listOfRegions.get(i));
                }
            }
        }
        return regionsToClean;
    }

    public ArrayList<Room> giveRooms(ArrayList<Room> listOfRooms) {
        ArrayList<Room> roomsToClean = new ArrayList<>();
        roomsToClean = collectRooms(listOfRooms);
        return roomsToClean;
    }

    private ArrayList<Room> collectRooms(ArrayList<Room> listOfRooms) {
        Scanner input = new Scanner (System.in);
        // storing the whole like as a string
        String inputLine = input.nextLine();
        // splitting the string by each space
        String[] trimmedInputLine = inputLine.trim().split(" ");
        // declaring integer list to store each string in the line converted to Integer
        ArrayList<Integer> indexRooms = new ArrayList();
        // storing each string in the line converted to Integer
        for (String s:trimmedInputLine) {
            indexRooms.add(Integer.parseInt(s));
        }
        // mapping integers in indexRegions to listOfRegions
        ArrayList<Room> roomsToClean = new ArrayList<>();
        for (int i = 0; i<listOfRooms.size(); i++) {
            for (Integer value:indexRooms) {
                value = value - 1;
                if (i == value){
                    roomsToClean.add(listOfRooms.get(i));
                }
            }
        }
        return roomsToClean;
    }
}

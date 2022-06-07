import java.util.ArrayList;

public class RoomsMode implements ModeController {
    RobotBoundary model;
    GUI view;
    ArrayList<Room> listOfRooms;
    ArrayList<Room> roomsToClean;

    public RoomsMode(RobotBoundary model, GUI view, ArrayList<Room> listOfRooms){
        this.model = model;
        this.view = view;
        this.listOfRooms = listOfRooms;
    }
    @Override
    public void execute() {
        view.displayRooms(listOfRooms);
        roomsToClean = view.giveRooms(listOfRooms);
        model.startRoomsMode(roomsToClean);
    }
}

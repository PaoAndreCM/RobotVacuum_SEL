import java.util.ArrayList;

public class RegionsMode implements ModeController {
    private RobotBoundary model;
    private GUI view;
    ArrayList<Region> listOfRegions;
    ArrayList<Region> regionsToClean;


    public RegionsMode(RobotBoundary model, GUI view, ArrayList<Region> listOfRegions){
        this.model = model;
        this.view = view;
        this.listOfRegions = listOfRegions;
    }

    @Override
    public void execute() {
        view.displayRegions(listOfRegions);
        view.giveMeRegions();
    }
}

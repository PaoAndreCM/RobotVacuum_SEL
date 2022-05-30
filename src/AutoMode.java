public class AutoMode implements ModeController {
    RobotBoundary model;
    GUI view;

    public AutoMode(RobotBoundary model, GUI view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        model.startAuto();
    }
}

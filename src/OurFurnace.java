import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Furnace;

public abstract class OurFurnace implements Furnace {

    public OurFurnace(){}

    @Override
    public void turnOn(){}

    @Override
    public void turnOff() {}

    @Override
    public ControllerInterface getController() {
        return null;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {}

    @Override
    public String getID() {
        return null;
    }

    @Override
    public void setID(String s) {}

    @Override
    public void enable() {}

    @Override
    public void disable() {}

    @Override
    public boolean enabled() {
        return false;
    }

    @Override
    public boolean isOn() {
        return false;
    }
}

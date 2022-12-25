import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, Observer, TemperatureSensor {

    protected NewTempSensorDriver newTempSensorDriver = new NewTempSensorDriver();

    private String ID;
    private int i;
    
    @Override
    public NewTempSensorDriver getAdatptee() {
        newTempSensorDriver.registerObserver(this);
        return newTempSensorDriver;
    }

    @Override
    public void update(int i) {
        this.i = i;
        System.out.println("Sensor ("+ID+") receiving new temperature: "+i+"");
    }

    @Override
    public void newTemperature(int i) {
        newTempSensorDriver.newTemperature(i);
    }

    @Override
    public ControllerInterface getController() {
        return null;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {

    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String s) {
        this.ID = s;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public boolean enabled() {
        return false;
    }

    @Override
    public int getReading() {
        return i;
    }
}

public class Humidifier extends OurFurnaceDecorator{

    public Humidifier(OurFurnace ourFurnace){
        super(ourFurnace);
    }

    @Override
    public void turnOn() {
        ourFurnace.turnOn();
        System.out.println("Humidifier: On");
    }

    @Override
    public void turnOff() {
        ourFurnace.turnOff();
        System.out.println("Humidifier: Off");
    }
}
public class WiFi extends OurFurnaceDecorator{

    public WiFi(OurFurnace ourFurnace){
        super(ourFurnace);
    }

    @Override
    public void turnOn() {
        ourFurnace.turnOn();
        System.out.println("WiFi: Initialized");
    }

    @Override
    public void turnOff() {
        ourFurnace.turnOff();
        System.out.println("WiFi: Disabled");
    }
}

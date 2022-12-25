public class PlainGasF1 extends OurFurnace {

    public PlainGasF1() {}

    @Override
    public void turnOn() {
        System.out.println("PlainGasF1: Up and Running");
    }

    @Override
    public void turnOff() {
        System.out.println("PlainGasF1: Has been turned off");
    }
}


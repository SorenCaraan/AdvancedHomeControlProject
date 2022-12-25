public abstract class OurFurnaceDecorator extends OurFurnace {
    protected OurFurnace ourFurnace;

    public OurFurnaceDecorator(OurFurnace ourFurnace) {
        this.ourFurnace = ourFurnace;
    }

    @Override
    public void turnOn(){
        ourFurnace.turnOn();
    }
}

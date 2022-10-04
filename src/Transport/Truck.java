package Transport;

public class Truck extends Transport{

    @Override
    protected void startMoving() {

    }

    @Override
    protected void finishTheMovement() {

    }

    public Truck(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

}

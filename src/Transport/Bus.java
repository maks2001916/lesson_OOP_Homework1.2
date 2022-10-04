package Transport;

public class Bus extends Transport {
    @Override
    protected void startMoving() {
        System.out.println("автобус начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("автобус закончил движение");
    }

    public Bus(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

}

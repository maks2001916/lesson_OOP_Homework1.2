package Transport;

public class Truck extends Transport{

    @Override
    protected void startMoving() {
        System.out.println("грузовой автомоюиль начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("грузовой автомобиль закончил движение");
    }

    public Truck(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

}

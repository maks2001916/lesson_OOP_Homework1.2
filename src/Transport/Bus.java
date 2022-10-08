package Transport;

public class Bus extends Transport implements  Competing{

    public enum capacity {ESPECIALLY_SMALL, SMALL, AVERAGE, BIG, ESPECIALLY_BIG}

    public static final String PIT_STOP = "автобус пересекает финишную черту";

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

    @Override
    public void pitStop() {
        System.out.println("автобус пересек финишную линию");
    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время - 8 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 140 км/ч");
    }

    public void info() {
        pitStop();
        maxSpeed();
        bestLapTime();
    }
}

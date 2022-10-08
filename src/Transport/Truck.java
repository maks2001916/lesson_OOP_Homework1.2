package Transport;

public class Truck extends Transport implements Competing{

    public enum loadCapacity {N1, N2, N3}

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

    @Override
    public void pitStop() {
        System.out.println("грузовая машина пересекла финишную линию");

    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время - 7 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 150 км/ч");
    }
    public void info() {
        pitStop();
        maxSpeed();
        bestLapTime();
    }
}

package Transport;

public class  Car extends Transport implements Competing, ADriver {
    @Override
    protected void startMoving() {
        System.out.println("легковой автомоюиль начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("легковой автомоюиль закончил движение");
    }

    public Car(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("машина пересекла финишную линию");

    }

    @Override
    public void bestLapTime() {
        System.out.println("лучшее время - 5 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость - 170 км/ч");
    }

    public void name() {
        getModel();
    }

    public void info() {
        pitStop();
        maxSpeed();
        bestLapTime();
    }

    @Override
    public String categoryA() {
        return getModel();
    }
}

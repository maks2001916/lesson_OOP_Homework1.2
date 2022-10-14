package Transport;

public class Bus extends Transport implements  Competing{

    public enum capacity {
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 25"),
        AVERAGE("40–50"),
        BIG("60–80"),
        ESPECIALLY_BIG("100–120 мест");

        public static capacity one(String determineTheTypeOfCar) {
            for (capacity tupe : values()) {
                if (tupe.getDetermineTheTypeOfCar().equals(determineTheTypeOfCar)) {
                    return tupe;
                }
            }
            return null;
        }

        private String determineTheTypeOfCar;

        capacity(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }

        public String getDetermineTheTypeOfCar() {
            return determineTheTypeOfCar;
        }

        public void setDetermineTheTypeOfCar(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }
    }

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

    @Override
    public void passDiagnostics() {
        System.out.println("Автобусы диагностику не проходят");
    }

    public void info() {
        pitStop();
        maxSpeed();
        bestLapTime();
    }
}

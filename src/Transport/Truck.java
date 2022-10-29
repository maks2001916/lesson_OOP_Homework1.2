package Transport;

public class Truck extends Transport implements Competing{

    public String typeOfRubber;  //тип резины

    public enum loadCapacity {
        N1("с полной массой до 3,5 тоннн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");
        private String determineTheTypeOfCar;

        public static loadCapacity one(String determineTheTypeOfCar) {
            for (loadCapacity tupe : values()) {
                if (tupe.getDetermineTheTypeOfCar().equals(determineTheTypeOfCar)) {
                    return tupe;
                }
            }
            return null;
        }

        public String getDetermineTheTypeOfCar() {
            return determineTheTypeOfCar;
        }

        public void setDetermineTheTypeOfCar(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }

        public void passDiagnostics() {
        }

        loadCapacity(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }
    }

    @Override
    protected void startMoving() {
        System.out.println("грузовой автомоюиль начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("грузовой автомобиль закончил движение");
    }

    @Override
    public void passDiagnostics() {
        if (getTypeOfRubber() == "Зима") {
            throw new RuntimeException("Грузовой автомобиль не прошёл диагностику");
        }
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public Truck(String stamp, String model, double engineCapacity, String typeOfRubber) {
        super(stamp, model, engineCapacity);
        this.typeOfRubber = typeOfRubber;
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

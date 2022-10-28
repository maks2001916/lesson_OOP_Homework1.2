package Transport;

import java.sql.Driver;

public class  Car extends Transport implements Competing {

    public String typeOfRubber;  //тип резины

    public enum bodyType {
        SEDAN("седан"),
        HATCHBACK("хечбек"),
        COMPARTMENT("купе"), 
        STATION_WAGON("универсал"),
        OFF_ROAD_VEHICLEOFF("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP_TRUCK("пикап"),
        VEN("фургон"),
        MINIVAN("минивен");

        public static bodyType one(String determineTheTypeOfCar) {
            for (bodyType tupe : values()) {
                if (tupe.getDetermineTheTypeOfCar().equals(determineTheTypeOfCar)) {
                    return tupe;
                }
            }
            return null;
        }

        private String determineTheTypeOfCar;

        bodyType(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }

        public String getDetermineTheTypeOfCar() {
            return determineTheTypeOfCar;
        }

        public void setDetermineTheTypeOfCar(String determineTheTypeOfCar) {
            this.determineTheTypeOfCar = determineTheTypeOfCar;
        }
    }
    @Override
    public void passDiagnostics() {
        if (getTypeOfRubber() == "Зима") {
            throw new RuntimeException("Автомобиль не прошёл диагностику");
        }
    }
    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    @Override
    protected void startMoving() {
        System.out.println("легковой автомоюиль начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("легковой автомоюиль закончил движение");
    }


    public Car(String stamp, String model, double engineCapacity, String typeOfRubber) {
        super(stamp, model, engineCapacity);
        this.typeOfRubber = typeOfRubber;
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

}

package Transport;

public class Bus extends Transport {
    private int fare; //плата за проезд
    private double TravelTime;  //Время поездки
    private String NameOfTheDepartureStation;  //Название станции отбытия
    private String FinalStop;  //Конечная остановка
    private int NumberOfWagons;  //Количество вагонов

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        if (fare > 0) {
            this.fare = fare;
        } else {
            System.out.println("введено неверное значение");
        }
    }

    public double getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime > 0) {
            this.TravelTime = travelTime;

        } else {
            System.out.println("введено неверное значение");
        }
    }

    public String getNameOfTheDepartureStation() {
        return NameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        if (nameOfTheDepartureStation != null && !nameOfTheDepartureStation.isBlank()
                && !nameOfTheDepartureStation.isEmpty()) {
            this.NameOfTheDepartureStation = nameOfTheDepartureStation;
        } else {
            System.out.println("введено неверное значение");
        }

    }

    public String getFinalStop() {
        return FinalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isBlank() && !finalStop.isEmpty()) {
            this.FinalStop = finalStop;
        } else {
            System.out.println("введено неверное значение");
        }

    }

    public int getNumberOfWagons() {
        return NumberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.NumberOfWagons = numberOfWagons;
        } else {
            System.out.println("введено неверное значение");
        }
    }

    public Bus(int fare, double travelTime, String nameOfTheDepartureStation,
                 String finalStop, int numberOfWagons, String stamp, String model, int yearOfRelease,
                 String productionCountry, String bodyColor,
                 double maximumMovementSpeed) {
        super(stamp, model, yearOfRelease, productionCountry, bodyColor, maximumMovementSpeed);
        this.fare = fare;
        this.TravelTime = travelTime;
        this.NameOfTheDepartureStation = nameOfTheDepartureStation;
        this.FinalStop = finalStop;
        this.NumberOfWagons = numberOfWagons;
    }

    public void Buss() {
        System.out.println("марка - " + getStamp());
        System.out.println("модель - " + getModel());
        System.out.println("год производства - " + getYearOfRelease());
        System.out.println("страна производства - " + getProductionCountry());
        System.out.println("цвет корпуса - " + getBodyColor());
        System.out.println("максимальная скорость двидения - " + getMaximumMovementSpeed());
        System.out.println("стоимость проезда - " + getFare());
        System.out.println("время поездки - " + getTravelTime() + " час.");
        System.out.println("название станции отбытия - " + getNameOfTheDepartureStation());
        System.out.println("конечная остановка - " + getFinalStop());
        System.out.println("количество вагонов - " + getNumberOfWagons());
        System.out.println();

    }
}

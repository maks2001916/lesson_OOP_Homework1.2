package Transport;

public class Train extends Transport {
    private int fare; //плата за проезд
    private int TravelTime;  //Время поездки
    private String NameOfTheDepartureStation;  //Название станции отбытия
    private String FinalStop;  //Конечная остановка
    private int NumberOfWagons;  //Количество вагонов

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        if (fare > 0) {
            this.fare = fare;
            System.out.println("плата за проезд - " + fare + "руб.");
        } else {
            System.out.println("введено неверное значение");
        }
    }

    public int getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime > 0) {
            this.TravelTime = travelTime;
            System.out.println("время поездки - " + travelTime + " мин.");
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
            System.out.println("название станции отбытия - " + nameOfTheDepartureStation);
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
            System.out.println("конечная остановка - " + finalStop);
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
            System.out.println("количество вагонов - " + numberOfWagons);
        } else {
            System.out.println("введено неверное значение");
        }
    }

    public Train(int fare, int travelTime, String nameOfTheDepartureStation,
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

    public void trains() {
        getFare();
        getFinalStop();
        getTravelTime();
        getNameOfTheDepartureStation();
        getNumberOfWagons();

    }
}

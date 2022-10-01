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
        this.fare = fare;
    }

    public int getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int travelTime) {
        TravelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return NameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        NameOfTheDepartureStation = nameOfTheDepartureStation;
    }

    public String getFinalStop() {
        return FinalStop;
    }

    public void setFinalStop(String finalStop) {
        FinalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return NumberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        NumberOfWagons = numberOfWagons;
    }

    public Train(int fare, int travelTime, String nameOfTheDepartureStation,
                 String finalStop, int numberOfWagons, String stamp, String model, int yearOfRelease,
                 String productionCountry, String bodyColor,
                 double maximumMovementSpeed) {
        super(fare, travelTime, nameOfTheDepartureStation, finalStop,
                numberOfWagons, stamp, model, yearOfRelease,
                productionCountry, bodyColor, maximumMovementSpeed);
        this.fare = fare;
        this.TravelTime = travelTime;
        this.NameOfTheDepartureStation = nameOfTheDepartureStation;
        this.FinalStop = finalStop;
        this.NumberOfWagons = numberOfWagons;
    }
}

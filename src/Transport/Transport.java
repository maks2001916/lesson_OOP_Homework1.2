package Transport;

public class Transport {
    private String stamp;  //марка
    private String model;  //модель
    private int yearOfRelease;  //год выпуска
    private String countryOfManufacture;  //страна производства
    private String bodyColor;  //цувет кузова
    private double maximumMovementSpeed;  //максимальная скорость передвижения

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "Введено не верное значение";
        }
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        if (maximumMovementSpeed > 0) {
            this.maximumMovementSpeed = maximumMovementSpeed;
        } else {
            this.maximumMovementSpeed = 1;
        }
    }

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void transport() {


    }
}

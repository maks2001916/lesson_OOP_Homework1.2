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
        this.bodyColor = bodyColor;
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
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
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            System.out.println("введено не верное значение цвета");
        }
        if (maximumMovementSpeed <= 0) {
            System.out.println("введено не верное значение скорости");
        }
    }
}

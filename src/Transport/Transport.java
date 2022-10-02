package Transport;

public abstract class Transport {
    private String stamp;  //марка
    private String model;  //модель
    private int yearOfRelease;  //год выпуска
    private String productionCountry;  //страна производства
    private String bodyColor;  //цувет кузова
    private double maximumMovementSpeed;  //максимальная скорость передвижения
    private String fill;  //топливо

    public String getBodyColor() {
        return bodyColor;
    }

    public String getFill() {
        return fill;
    }

    public abstract void fill();

    public void setFill(String fill) {
        this.fill = fill;
    }

    protected abstract void refill();

    public void setStamp(String stamp) {
        if (stamp != null && !stamp.isBlank() && !stamp.isEmpty()) {
            this.stamp = stamp;
        } else {
            this.stamp = "default";
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }
    }

    public String getStamp() {
        return stamp;
    }

    public Transport(String stamp, String model, int yearOfRelease,
                     String productionCountry, String bodyColor,
                     double maximumMovementSpeed, String fill) {
        this.fill = fill;
        this.stamp = stamp;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.productionCountry = productionCountry;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "Введено не верное значение";
        }
    }


    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getProductionCountry() {
        return productionCountry;
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

}

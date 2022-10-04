package Transport;

import java.util.Objects;

public abstract class Transport {
    private String stamp;  //марка
    private String model;  //модель
    private double engineCapacity;  //объём двигателя
//    private int yearOfRelease;  //год выпуска
//    private String productionCountry;  //страна производства
//    private String bodyColor;  //цувет кузова
//    private double maximumMovementSpeed;  //максимальная скорость передвижения
//    private String fill;  //топливо

//    public String getBodyColor() {
//        return bodyColor;
//    }

//    public String getFill() {
//        return fill;
//    }

//    public abstract void fill();

//    public void setFill(String fill) {
//        this.fill = fill;
//    }

//    protected abstract void refill();

    protected abstract void startMoving();
    protected abstract void finishTheMovement();

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
    public String getModel() {
        return model;
    }
    public Transport(String stamp, String model, double engineCapacity) {
        this.stamp = stamp;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

//    public Transport(String stamp, String model, int yearOfRelease,
//                     String productionCountry, String bodyColor,
//                     double maximumMovementSpeed, String fill) {
//        this.fill = fill;
//        this.stamp = stamp;
//        this.model = model;
//        this.yearOfRelease = yearOfRelease;
//        this.productionCountry = productionCountry;
//        this.bodyColor = bodyColor;
//        this.maximumMovementSpeed = maximumMovementSpeed;
//    }

//    public void setBodyColor(String bodyColor) {
//        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
//            this.bodyColor = bodyColor;
//        } else {
//            this.bodyColor = "Введено не верное значение";
//        }
//    }




//    public int getYearOfRelease() {
//        return yearOfRelease;
//    }

//    public String getProductionCountry() {
//        return productionCountry;
//    }

//    public double getMaximumMovementSpeed() {
//        return maximumMovementSpeed;
//    }

//    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
//        if (maximumMovementSpeed > 0) {
//            this.maximumMovementSpeed = maximumMovementSpeed;
//        } else {
//            this.maximumMovementSpeed = 1;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(stamp, transport.stamp) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stamp, model, engineCapacity);
    }

    @Override
    public String toString() {
        return "транспорт{" +
                "мрка - '" + stamp + '\'' +
                ", модель - '" + model + '\'' +
                ", объём двигателя - " + engineCapacity +
                '}';
    }
}

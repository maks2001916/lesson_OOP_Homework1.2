package Transport;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

import community.Mechanic;
import community.Sponsor;

public abstract class Transport {
    private String stamp;  //марка
    private String model;  //модель
    private double engineCapacity;  //объём двигателя
    private Set<Transport> mechanic;
    private Set<Sponsor> sponsors;
    private Set<Driver> drivers;
    private Set<Mechanic> mechanics;


    protected abstract void startMoving();
    protected abstract void finishTheMovement();



    public void setStamp(String stamp) {
        if (stamp != null && !stamp.isBlank()) {
            this.stamp = stamp;
        } else {
            this.stamp = "default";
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) {
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
                "марка - '" + getStamp() + '\'' +
                ", модель - '" + getModel() + '\'' +
                ", объём двигателя - " + engineCapacity +
                '}';
    }
}

package Transport;

import java.util.Objects;


public class Driver<T extends Car &  ADriver> {
    private String FIO;
    private int experience;
    private boolean driversLicense;

    public Driver(String FIO, int experience, boolean driversLicense) {
        this.FIO = FIO;
        this.experience = experience;
        this.driversLicense = driversLicense;
    }

    public void go(T one) {
        System.out.println("водитель - " + FIO + " управляет автомобилем car и будет участвовать в заезде " );
        name();
    }

    private void name() {
    }

    public void stop() {

    }

    public void refuelTheCar() {

    }


    public String getFIO() {
        return FIO;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && driversLicense == driver.driversLicense && Objects.equals(FIO, driver.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, experience, driversLicense);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + FIO + '\'' +
                ", experience=" + experience +
                ", driversLicense=" + driversLicense +
                '}';
    }
}

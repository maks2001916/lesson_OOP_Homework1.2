package Transport;

import java.util.Objects;


public class Driver<T extends Transport & Competing> {
    private String fio;
    private int experience;
    private boolean driversLicense;

    public Driver(String fio, int experience, boolean driversLicense) {
        this.fio = fio;
        this.experience = experience;
        this.driversLicense = driversLicense;
    }

    public void go(T one) {
        System.out.println("водитель - " + fio + " управляет автомобилем car и будет участвовать в заезде " );

    }

    private void name() {
    }

    public void stop() {

    }

    public void refuelTheCar() {

    }


    public String getFio() {
        return fio;
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
        return experience == driver.experience && driversLicense == driver.driversLicense && Objects.equals(fio, driver.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, experience, driversLicense);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + fio + '\'' +
                ", experience=" + experience +
                ", driversLicense=" + driversLicense +
                '}';
    }
}

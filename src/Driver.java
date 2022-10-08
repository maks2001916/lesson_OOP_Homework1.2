import Transport.Transport;

import java.util.Objects;
import Transport.Competing;

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
        System.out.println("водитель - " + fio + " управляет автомобилем " + one.toString() +
                          "и будет участвовать в заезде " );
    }

    public void stop(T car) {
        car.pitStop();
        System.out.println("водитель остановился");
    }

    public void refuelTheCar(T car) {
        System.out.println("водитель заправил авто - " + car.getStamp() +
                 " " + car.getModel());
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

package Transport;

import java.util.Objects;

public class Driver {
    private String name;  //имя
    private String surname;  //фамилия
    private String patronymic;  //отчество
    private boolean driversLicense;
    private int experience;

    public Driver(String name, String surname, String patronymic, boolean driversLicense, int experience) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicense == driver.driversLicense && experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname) && Objects.equals(patronymic, driver.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, driversLicense, experience);
    }

    public void startMoving() {

    }

    public void stop() {

    }

    public void refuelTheCar() {

    }



    @Override
    public String toString() {
        return "водитель{" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", отчество='" + patronymic + '\'' +
                ", водительские права=" + driversLicense +
                ", стаж=" + experience +
                '}';
    }
}

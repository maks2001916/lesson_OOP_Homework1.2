import Transport.Transport;

import java.util.ArrayList;
import java.util.Objects;

public class Mechanic {
    private String nameSurname;  //имя фамилия
    private String companyName;  //имя компании
    private char typeOfCarForWork;  //тип авто для работ
    private  ArrayList<Transport> mechanic;
    private ArrayList<Sponsor> sponsors;
    private ArrayList<Driver> drivers;
    private ArrayList<Mechanic> mechanics;

    public Mechanic(String nameSurname, String companyName, char typeOfCarForWork) {
        this.nameSurname = nameSurname;
        this.companyName = companyName;
        this.typeOfCarForWork = typeOfCarForWork;
        mechanic = new ArrayList<>();
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }

    public ArrayList<Transport> getMechanic() {
        return mechanic;
    }

    public void performMaintenance() {

    }

    public void fixTheCar() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic1 = (Mechanic) o;
        return Objects.equals(nameSurname, mechanic1.nameSurname) && Objects.equals(companyName, mechanic1.companyName)
                && Objects.equals(typeOfCarForWork, mechanic1.typeOfCarForWork) && Objects.equals(mechanic, mechanic1.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, companyName, typeOfCarForWork, mechanic);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameSurname='" + nameSurname + '\'' +
                ", companyName='" + companyName + '\'' +
                ", typeOfCarForWork='" + typeOfCarForWork + '\'' +
                ", mechanic=" + mechanic +
                '}';
    }
}

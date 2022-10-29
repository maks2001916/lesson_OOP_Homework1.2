package community;

import java.util.Objects;

public class Mechanic {
    private String nameSurname;  //имя фамилия
    private String companyName;  //имя компании
    private char typeOfCarForWork;  //тип авто для работ


    public Mechanic(String nameSurname, String companyName, char typeOfCarForWork) {
        this.nameSurname = nameSurname;
        this.companyName = companyName;
        this.typeOfCarForWork = typeOfCarForWork;
    }


    public void performMaintenance() {

    }

    public void fixTheCar() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return typeOfCarForWork == mechanic.typeOfCarForWork && Objects.equals(nameSurname, mechanic.nameSurname) && Objects.equals(companyName, mechanic.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, companyName, typeOfCarForWork);
    }

    @Override
    public String toString() {
        return "community.Mechanic{" +
                "nameSurname='" + nameSurname + '\'' +
                ", companyName='" + companyName + '\'' +
                ", typeOfCarForWork=" + typeOfCarForWork +
                '}';
    }
}

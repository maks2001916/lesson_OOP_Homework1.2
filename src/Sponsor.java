import Transport.Transport;

import java.util.Objects;
import Transport.Competing;

public class Sponsor {
    private String name;

    public Sponsor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void name() {
        System.out.println("спонсор - " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                '}';
    }
}

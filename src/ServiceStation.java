import Transport.Transport;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ServiceStation<T extends Transport> {
    private Set<T> queue = new HashSet<>();
    private T carx;
    public void addACarToTheQueue(T car) {
        queue.add(car);
        carx = car;
    }

    public void carryOutATechnicalInspectionOfTheCar() {

        if (carx != null) {
            System.out.println("автомобиль - " + carx + " проходит тех обслуживание");
        }
    }
}

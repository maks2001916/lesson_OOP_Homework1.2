import Transport.Transport;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ServiceStation<T extends Transport> {
    private Set<T> queue = new HashSet<>();

    public void addACarToTheQueue(T car) {
        queue.add(car);
    }

    public void carryOutATechnicalInspectionOfTheCar() {
        T car = null;
        for (T num: queue ) {
            car = num;
            break;
        }

        if (car != null) {
            System.out.println("автомобиль - " + car + " проходит тех обслуживание");
        }
    }
}

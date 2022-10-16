import Transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public void addACarToTheQueue(T car) {
        queue.offer(car);
    }

    public void carryOutATechnicalInspectionOfTheCar() {
        T car = queue.poll();
        if (car != null) {
            System.out.println("автомобиль - " + car + " проходит тех обслуживание");
            carryOutATechnicalInspectionOfTheCar();
        }
    }
}

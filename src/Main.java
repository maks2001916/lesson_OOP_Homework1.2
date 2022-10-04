import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car("stamp A", "model A", 1.0);
        Car car2 = new Car("stamp B", "model B", 1.1);
        Car car3 = new Car("stamp C", "model C", 1.2);
        Car car4 = new Car("stamp D", "model D", 1.3);
        Truck truck1 = new Truck("stamp 1", "model 1", 1.4);
        Truck truck2 = new Truck("stamp 2", "model 2", 1.5);
        Truck truck3 = new Truck("stamp 3", "model 3", 1.6);
        Truck truck4 = new Truck("stamp 4", "model 4", 1.7);
        Bus bus1 = new Bus("stamp a", "model a", 1.2);
        Bus bus2 = new Bus("stamp b", "model b", 1.3);
        Bus bus3 = new Bus("stamp c", "model c", 1.4);
        Bus bus4 = new Bus("stamp d", "model d", 1.5);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
    }
}
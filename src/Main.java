import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;
import community.Driver;
import community.Mechanic;
import community.Sponsor;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car("stamp A", "model A", 1.0, "Лето");
        Car car2 = new Car("stamp B", "model B", 1.1, "Лето");
        Car car3 = new Car("stamp C", "model C", 1.2, "Лето");
        Car car4 = new Car("stamp D", "model D", 1.3, "Лето");
        Truck truck1 = new Truck("stamp 1", "model 1", 1.4, "Лето");
        Truck truck2 = new Truck("stamp 2", "model 2", 1.5, "Лето");
        Truck truck3 = new Truck("stamp 3", "model 3", 1.6, "Лето");
        Truck truck4 = new Truck("stamp 4", "model 4", 1.7, "Лето");
        Bus bus1 = new Bus("stamp a", "model a", 1.2);
        Bus bus2 = new Bus("stamp b", "model b", 1.3);
        Bus bus3 = new Bus("stamp c", "model c", 1.4);
        Bus bus4 = new Bus("stamp d", "model d", 1.5);
        System.out.println(car1);
        car1.info();
        System.out.println(car2);
        car2.info();
        System.out.println(car3);
        car3.info();
        System.out.println(car4);
        car4.info();
        System.out.println(truck1);
        truck1.info();
        System.out.println(truck2);
        truck2.info();
        System.out.println(truck3);
        truck3.info();
        System.out.println(truck4);
        truck4.info();
        System.out.println(bus1);
        bus1.info();
        System.out.println(bus2);
        bus2.info();
        System.out.println(bus3);
        bus3.info();
        System.out.println(bus4);
        bus4.info();

        Driver<Car> ivan  = new Driver<Car>("иванов иван иванович", 5, 'b');
        Driver<Truck> nikolai = new Driver<Truck>("Николаев Николай Николаевич", 8, 'c');
        ivan.go(car1);
        ivan.stop(car2);
        ivan.equals(car3);

        Mechanic mechanic1 = new Mechanic("Иванов Иван", "омпания 1", 'B');
        Mechanic mechanic2 = new Mechanic("Владимиров владимир влвдимирович", "компания 2", 'C');
        Sponsor sponsor1 = new Sponsor("Дмитрий");
        Sponsor sponsor2 = new Sponsor("Александр");

        ServiceStation<Transport> station1 = new ServiceStation<>();
        station1.addACarToTheQueue(car1);
        station1.addACarToTheQueue(bus1);
        station1.carryOutATechnicalInspectionOfTheCar();

        mechanic1.getMechanic().add(car1);
        mechanic1.getMechanic().add(car2);
        mechanic2.getMechanic().add(bus1);
        mechanic2.getMechanic().add(bus2);
        mechanic1.getSponsors().add(sponsor1);
        mechanic2.getSponsors().add(sponsor2);
        mechanic1.getDrivers().add(ivan);
        mechanic1.getMechanics().add(mechanic1);
        mechanic1.getMechanics().add(mechanic2);


    }
}
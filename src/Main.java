import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args)
    {
//        Car Lada = new Car("Lada", null, 1.7,
//                "желтый", 2015, "Россия",
//                "автомат", null, "a111aa111",
//                5, "зимняя", 160, "электричество");
//        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
//                "чёрный", 2020, "Германия",
//                "автомат", null, "b222bb222",
//                5, "летняя", 200, "электричество");
//        Car BMW = new Car("BMW", "Z8", 3.0,
//                "чёрный", 2021, "Германия",
//                "автомат", null, "c333cc333",
//                5, "зимняя", 200, "бензин");
//        Car Kia = new Car("Kia", "Sportage 4 поколениие", 2.4,
//                "красный", 2018, "Южная Корея",
//                "механика", null, "639629",
//                5, "летняя", 160, "бензин");
//        Car Hyungai = new Car("Hyundai", "Avante", 1.6,
//                "оранжевый", 2016, "Южная Корея",
//                "механика", null, "e555ee555",
//                5, "зимняя", 160, "бензин");
//        Lada.Car();
 //       Audi.Car();
//        BMW.Car();
//        Kia.Car();
//        Hyungai.Car();

//        Train Lastohka = new Train(3500, 3, "Белорусский вокзал",
//                "Минск-пассаажирский", 11, "Lastohka",
//                "B-901", 2011, "Россия", "белый",
//                301, "дизель");
//        Train Leningrad = new Train(1700, 1.3, "Ленинградский вокзал",
//                "Ленинград-пассаажирский", 8, "Leningrad",
//                "D-125", 2019, "Россия", "синий",
///                270, "дизель");

//        Lastohka.trains();
//        Leningrad.trains();

//        Bus Bus1 = new Bus(300, 1, "вокзал 1",
//                "вокзал 2", 1, "BUS1", "A-001",
//                2011, "Россия", "белый",
//                70, "дизель");
//        Bus Bus2 = new Bus(350, 1.3, "вокзал 3",
//                "вокзал 4", 1, "BUS2", "B-002",
//                2015, "Россия", "белый",
//                90, "бензин");

//        Bus1.Buss();
//        Bus2.Buss();
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
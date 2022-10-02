import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args)
    {
        Car Lada = new Car("Lada", null, 1.7,
                "желтый", 2015, "Россия",
                "автомат", null, "a111aa111",
                5, "зимняя", 160, "электричество");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "чёрный", 2020, "Германия",
                "автомат", null, "b222bb222",
                5, "летняя", 200, "электричество");
        Car BMW = new Car("BMW", "Z8", 3.0,
                "чёрный", 2021, "Германия",
                "автомат", null, "c333cc333",
                5, "зимняя", 200, "бензин");
        Car Kia = new Car("Kia", "Sportage 4 поколениие", 2.4,
                "красный", 2018, "Южная Корея",
                "механика", null, "639629",
                5, "летняя", 160, "бензин");
        Car Hyungai = new Car("Hyundai", "Avante", 1.6,
                "оранжевый", 2016, "Южная Корея",
                "механика", null, "e555ee555",
                5, "зимняя", 160, "бензин");
        Lada.Car();
        Audi.Car();
        BMW.Car();
        Kia.Car();
        Hyungai.Car();

        Train Lastohka = new Train(3500, 3, "Белорусский вокзал",
                "Минск-пассаажирский", 11, "Lastohka",
                "B-901", 2011, "Россия", "белый",
                301, "дизель");
        Train Leningrad = new Train(1700, 1.3, "Ленинградский вокзал",
                "Ленинград-пассаажирский", 8, "Leningrad",
                "D-125", 2019, "Россия", "синий",
                270, "дизель");

        Lastohka.trains();
        Leningrad.trains();

        Bus Bus1 = new Bus(300, 1, "вокзал 1",
                "вокзал 2", 1, "BUS1", "A-001",
                2011, "Россия", "белый",
                70, "дизель");
        Bus Bus2 = new Bus(350, 1.3, "вокзал 3",
                "вокзал 4", 1, "BUS2", "B-002",
                2015, "Россия", "белый",
                90, "бензин");

        Bus1.Buss();
        Bus2.Buss();
    }
}
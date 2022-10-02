import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args)
    {
        Car Lada = new Car("Lada", null, 1.7,
                "желтый", 2015, "Россия",
                "автомат", null, "a111aa111",
                5, "зимняя", 160);
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "чёрный", 2020, "Германия",
                "автомат", null, "b222bb222",
                5, "летняя", 200);
        Car BMW = new Car("BMW", "Z8", 3.0,
                "чёрный", 2021, "Германия",
                "автомат", null, "c333cc333",
                5, "зимняя", 200);
        Car Kia = new Car("Kia", "Sportage 4 поколениие", 2.4,
                "красный", 2018, "Южная Корея",
                "механика", null, "639629",
                5, "летняя", 160);
        Car Hyungai = new Car("Hyundai", "Avante", 1.6,
                "оранжевый", 2016, "Южная Корея",
                "механика", null, "e555ee555",
                5, "зимняя", 160);
        Lada.Car();
        Audi.Car();
        BMW.Car();
        Kia.Car();
        Hyungai.Car();

        Train Lastohka = new Train(3500, 3, "Белорусский вокзал",
                "Минск-пассаажирский", 11, "Lastohka",
                "B-901", 2011, "Россия", "белый",
                301);
        Train Leningrad = new Train(1700, 1.3, "Ленинградский вокзал",
                "Ленинград-пассаажирский", 8, "Leningrad",
                "D-125", 2019, "Россия", "синий",
                270);

        Lastohka.trains();
        Leningrad.trains();
    }
}
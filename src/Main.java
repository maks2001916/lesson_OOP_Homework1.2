import Transport.Car;

public class Main {
    public static void main(String[] args)
    {
        Car Lada = new Car("Lada", null, 1.7,
                "желтый", 2015, "Россия",
                "автомат", null, "a111aa111",
                5, "зимняя");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "чёрный", 2020, "Германия",
                "автомат", null, "b222bb222",
                5, "летняя");
        Car BMW = new Car("BMW", "Z8", 3.0,
                "чёрный", 2021, "Германия",
                "автомат", null, "c333cc333",
                5, "зимняя");
        Car Kia = new Car("Kia", "Sportage 4 поколениие", 2.4,
                "красный", 2018, "Южная Корея",
                "механика", null, "639629",
                5, "летняя");
        Car Hyungai = new Car("Hyundai", "Avante", 1.6,
                "оранжевый", 2016, "Южная Корея",
                "механика", null, "e555ee555",
                5, "зимняя");
        Lada.Car();
        Audi.Car();
        BMW.Car();
        Kia.Car();
        Hyungai.Car();


    }
}
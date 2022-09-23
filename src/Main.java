public class Main {
    public static void main(String[] args)
    {
        Car Lada = new Car("Lada", null, 1.7,
                "желтый", 2015, "Россия");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "чёрный", 2020, "Германия");
        Car BMW = new Car("BMW", "Z8", 3.0,
                "чёрный", 2021, "Германия");
        Car Kia = new Car("Kia", "Sportage 4 поколениие", 2.4,
                "красный", 2018, "Южная Корея");
        Car Hyungai = new Car("Hyundai", "Avante", 1.6,
                "оранжевый", 2016, "Южная Корея");
        Lada.Car();
        Audi.Car();
        BMW.Car();
        Kia.Car();
        Hyungai.Car();
    }
}
public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

     Car(String brand, String model, double engineVolume,
        String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void Car() {
        System.out.println("Автомобиль " + brand + " " + model + " выпущен в " + productionYear + " году");
        System.out.println("имеет двигатель объёмом " + engineVolume + " л. и " + color + " цвет корпуса");
        System.out.println("Производитель - " + productionCountry);
        System.out.println();
    }

}

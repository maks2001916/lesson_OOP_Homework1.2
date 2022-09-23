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
        if (brand == null || model == null || productionCountry == null) {
            brand = "default";
            model = "default";
            productionCountry = "default";
            System.out.println("Автомобиль " + brand + " " + model + ", производитель - " + productionCountry);
        } else {
            System.out.println("Автомобиль " + brand + " " + model + ", производитель - " + productionCountry);
    }
        if (engineVolume == 0) {
            engineVolume = 1.5;
            System.out.println("имеет двигатель объёмом " + engineVolume + " л.");
        } else {
            System.out.println("имеет двигатель объёмом " + engineVolume + " л.");
        }
        if (color == null) {
            color = "белый";
            System.out.println("Цвет кузова - " + color);
        } else {
            System.out.println("Цвет кузова - " + color);
        }
        if (productionYear == 0) {
            productionYear = 2000;
            System.out.println("Выпущен в " + productionYear + " году");
        } else {
            System.out.println("Выпущен в " + productionYear + " году");
        }
        System.out.println();
    }

}

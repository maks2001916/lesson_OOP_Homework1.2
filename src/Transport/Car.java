package Transport;

import java.util.regex.Pattern;

public class  Car extends Transport {
    private String stamp;  //марка
    private String model;  //модель
    private double engineVolume;  //мощность двигателя
    private String bodyColor;  //цвет кузова
    private int yearOfRelease;  //год выпуска
    private String productionCountry;  //страна - производитель
    private String transmission;  //коробка передач
    private String bodyType;  //тип кузова
    private String registrationNumber;  //регистрационный номер
    private int numberOfSeats;  //количество мест
    private String typeOfRubber;  //тип резины
    private double maximumMovementSpeed;  //максимальная скорость передвижения

    public static class key {
        private String remoteEngineStart;
        private String keylessAccess;

        public key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public void key() {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                remoteEngineStart = "не казан";
                System.out.println("удалённый запуск двигателя - " + remoteEngineStart);
            } else {
                System.out.println("удалённый запуск двигателя - " + remoteEngineStart);
            }
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                keylessAccess = "не казан";
                System.out.println("удалённый запуск двигателя - " + keylessAccess);
            } else {
                System.out.println("удалённый запуск двигателя - " + keylessAccess);
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public class insurance {
            private int insuranceValidityPeriod;
            private int theCostOfInsurance;
            private String insuranceNumber;

            public insurance(int insuranceValidityPeriod, int theCostOfInsurance, String insuranceNumber) {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
                this.theCostOfInsurance = theCostOfInsurance;
                this.insuranceNumber = insuranceNumber;
            }
            public int getInsuranceValidityPeriod() {
                return insuranceValidityPeriod;
            }

            public void setInsuranceNumber(String insuranceNumber) {
                this.insuranceNumber = insuranceNumber;
            }

            public int getTheCostOfInsurance() {
                return theCostOfInsurance;
            }

            public String getInsuranceNumber() {
                return insuranceNumber;
            }

            public void insuranceValidityPeriod() {
                if (insuranceValidityPeriod < 0) {
                    System.out.println("введено не верное значение страховки");
                }
                if (insuranceValidityPeriod > 1) {
                    System.out.println("Страховка просрочена");
                }
            }

            public void insuranceNumber() {
                if (insuranceNumber.length() < 9 || insuranceNumber.length() > 9) {
                    System.out.println("Номер страховки некорректный!");
                }
            }

        }

    }

    public Car(String stamp, String model, double engineVolume, String bodyColor, int yearOfRelease,
               String productionCountry, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, String typeOfRubber,
               double maximumMovementSpeed) {

        super(stamp, model, yearOfRelease, productionCountry, bodyColor, maximumMovementSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0 ) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public void Car() {
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {;
            productionCountry = "default";
            System.out.println("Автомобиль " + stamp + " " + model + ", производитель - " + productionCountry);
        } else {
            System.out.println("Автомобиль " + stamp + " " + model + ", производитель - " + productionCountry);
        }

        if (engineVolume == 0) {
            engineVolume = 1.5;
            System.out.println("имеет двигатель объёмом " + engineVolume + " л.");
        } else {
            System.out.println("имеет двигатель объёмом " + engineVolume + " л.");
        }
        if (yearOfRelease == 0) {
            yearOfRelease = 2000;
            System.out.println("Выпущен в " + yearOfRelease + " году");
        } else {
            System.out.println("Выпущен в " + yearOfRelease + " году");
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            transmission = "не указана";
            System.out.println("коробка передач - " + transmission);
        } else {
            System.out.println("коробка передач - " + transmission);
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            bodyType = "не указан";
            System.out.println("тип кузова - " + bodyType);
        } else {
            System.out.println("тип кузова - " + bodyType);
        }
        if (registrationNumber == String.valueOf(Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d")
                .matcher(registrationNumber)));
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            registrationNumber = "не указан";
            System.out.println("регистрационнный номер - " + registrationNumber);
        } else {
            System.out.println("регистрационный номер - " + registrationNumber);
        }
        if (numberOfSeats <= 0) {
            numberOfSeats = 1;
            System.out.println("количество мест - " + numberOfSeats);
        } else {
            System.out.println("количество мест - " + numberOfSeats);
        }
        if (typeOfRubber == null || typeOfRubber.isBlank() || typeOfRubber.isEmpty()) {
            typeOfRubber = "не указана";
            System.out.println("резина - " + typeOfRubber);
        } else {
            System.out.println("резина - " + typeOfRubber);
        }
        System.out.println();
    }

    private String registrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return registrationNumber;
    }


    public static String season() {
        String season = "лето";
        return season;
    }
    public void rubberChange(String season) {
        if (season == "лето" && typeOfRubber == "зимняя") {
            typeOfRubber = "летняя";
        }
        if (season == "зима" && typeOfRubber == "летняя") {
            typeOfRubber = "зимняя";
        }
    }

}

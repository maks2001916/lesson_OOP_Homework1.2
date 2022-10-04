package Transport;

import java.util.regex.Pattern;

public class  Car extends Transport {
    @Override
    protected void startMoving() {
        System.out.println("легковой автомоюиль начал движение");
    }

    @Override
    protected void finishTheMovement() {
        System.out.println("легковой автомоюиль закончил движение");
    }

    public Car(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ICar> cars = new ArrayList<>();

        ICar car1 = new VF5("30A-999.99");
        ICar car2 = new VF8("29A-123.45");

        cars.add(car1);
        cars.add(car2);

        System.out.println("\n--- Car Information ---");
        for (ICar car : cars) {
            car.showInfo();
            car.accelerate();
            car.brake();
            System.out.println();
        }
    }
}


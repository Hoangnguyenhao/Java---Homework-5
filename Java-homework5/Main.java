public class Main {
    public static void main(String[] args) {
        ICar car1 = new VF5("51H-12345");
        ICar car2 = new VF8("30A-67890");

        car1.showInfo();
        car1.accelerate();
        car1.brake();

        System.out.println();

        car2.showInfo();
        car2.accelerate();
        car2.brake();
    }
}

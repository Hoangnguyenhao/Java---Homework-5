public class VF5 implements ICar {
    private String licensePlate;
    private int wheels;
    private int seats;

    public VF5(String licensePlate) {
        this.licensePlate = licensePlate;
        this.wheels = 4;
        this.seats = 5;
    }

    public void showInfo() {
        System.out.println("===== VF5 =====");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
    }

    public void accelerate() {
        System.out.println("VF5 is accelerating...");
    }

    public void brake() {
        System.out.println("VF5 is braking...");
    }
}

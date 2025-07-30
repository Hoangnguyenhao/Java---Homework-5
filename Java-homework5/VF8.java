public class VF8 implements ICar {
    private String licensePlate;
    private int wheels;
    private int seats;

    public VF8(String licensePlate) {
        this.licensePlate = licensePlate;
        this.wheels = 4;
        this.seats = 7;
    }

    public void showInfo() {
        System.out.println("===== VF8 =====");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
    }

    public void accelerate() {
        System.out.println("VF8 is accelerating...");
    }

    public void brake() {
        System.out.println("VF8 is braking...");
    }
}

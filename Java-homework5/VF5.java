public class VF5 implements ICar {
    private String licensePlate;
    private final int numberOfSeats = 5;

    public VF5(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void brake() {
        System.out.println("VF5 is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println("VF5 is accelerating...");
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("===== VF5 =====");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Wheels: " + getNumberOfWheels());
        System.out.println("Seats: " + numberOfSeats);
    }
}
